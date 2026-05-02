# 🏭 Factory Method Pattern — Complete Revision Notes (Java + Spring Boot)

## 1. What Problem Does It Solve?
Encapsulates object creation logic and removes tight coupling.

Avoids:
- if-else / switch
- direct dependency on concrete classes

---

## 2. Core Idea
Client:
- Knows WHAT to create

Factory:
- Knows HOW to create

---

## 3. Structure
- Product (interface)
- Concrete Products
- Factory (Creator)
- Concrete Factories

---

## 4. Example

interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("UPI payment");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Card payment");
    }
}

abstract class PaymentFactory {

    public void processPayment() {
        Payment payment = createPayment();
        payment.pay();
    }

    protected abstract Payment createPayment();
}

class UpiPaymentFactory extends PaymentFactory {
    protected Payment createPayment() {
        return new UpiPayment();
    }
}

class CardPaymentFactory extends PaymentFactory {
    protected Payment createPayment() {
        return new CardPayment();
    }
}

---

## 5. Key Concepts
- Object creation is delegated to subclasses
- Removes direct dependency on concrete classes
- Supports Open/Closed Principle

---

## 6. Factory Method vs Simple Factory

Simple Factory:
- Uses if-else or switch
- Violates OCP

Factory Method:
- Uses subclasses
- Supports OCP

---

## 7. When to Use
- Multiple implementations exist
- Object creation logic varies
- Want to follow OCP

---

## 8. When NOT to Use
- Only one implementation exists
- No variation
- Over-engineering risk

---

## 9. Spring Boot Mapping
- BeanFactory
- ApplicationContext
- getBean()

Example:
context.getBean(PaymentService.class);

---

## 10. Interview Answers

Why Factory Method?
“To delegate object creation to subclasses and remove tight coupling.”

OCP benefit?
“New types are added via new classes without modifying existing ones.”

---

## 11. Common Mistakes
- Using switch → becomes Simple Factory
- Letting client create objects
- Not separating creation logic

---

## Final Mental Model
Factory Method = Let subclasses decide what to create
