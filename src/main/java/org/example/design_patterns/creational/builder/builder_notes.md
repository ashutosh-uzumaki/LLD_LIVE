# 🧱 Builder Pattern — Complete Revision Notes (Java + Spring Boot)

## 1. What Problem Does It Solve?
Builder helps construct complex objects step-by-step.

Used when:
- Many optional fields
- Constructor becomes unreadable
- Need immutability + flexibility

---

## 2. Core Idea
Separate:
- Construction process (Builder)
- Final object (Product)

---

## 3. Structure
- Product class (immutable)
- Static inner Builder class
- Required fields in Builder constructor
- Optional fields via setters
- build() method returns object

---

## 4. Example

public class User {

    private final String name;
    private final String email;
    private final Integer age;
    private final String phone;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public static class Builder {
        private final String name;
        private final String email;
        private Integer age;
        private String phone;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            if (name == null || email == null) {
                throw new IllegalStateException("Required fields missing");
            }
            return new User(this);
        }
    }
}

---

## 5. Key Concepts

Immutability:
- Fields are final
- No setters in product class

Method Chaining:
- Each setter returns this

Required vs Optional:
- Required → Builder constructor
- Optional → setters

---

## 6. toBuilder()

Used to modify immutable objects

public Builder toBuilder() {
    return new Builder(this.name, this.email)
            .setAge(this.age)
            .setPhone(this.phone);
}

---

## 7. When to Use

- Many optional fields
- Complex construction
- Need immutability
- Avoid constructor confusion

---

## 8. When NOT to Use

- Simple objects (2–3 fields)
- No optional fields
- No readability issues

---

## 9. Builder vs Constructor

Constructor:
- Hard to read with many params
- Poor optional handling

Builder:
- Clean and readable
- Flexible

---

## 10. Builder vs Decorator

Builder:
- Creates object

Decorator:
- Enhances object

---

## 11. Spring Boot Mapping

Lombok:
@Builder

ResponseEntity:
ResponseEntity.ok().body(data);

---

## 12. Common Mistakes

- Fields not final
- No validation in build()
- Allowing incomplete objects
- No method chaining

---

## 13. Interview Lines

“Builder constructs complex objects step-by-step.”

“Improves readability and supports immutability.”

---

## Final Mental Model

Builder = Step-by-step construction of complex objects
