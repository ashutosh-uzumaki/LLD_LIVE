# 🧠 Singleton Pattern — Complete Revision Notes (Java + Spring Boot)

## 1. What Problem Does It Solve?
Ensures only ONE instance exists and provides a global access point.

Use when:
- Expensive resources (DB, threads, cache)
- Shared control (RateLimiter, Config)

---

## 2. Core Idea
- Private constructor → restrict creation
- Static method → global access

---

## 3. Implementations

### Eager Initialization
private static final Singleton INSTANCE = new Singleton();

Pros: Simple  
Cons: Not lazy

---

### Lazy (Not Thread Safe)
if (instance == null) {
    instance = new Singleton();
}

Issue: Race condition

---

### Double Checked Locking (DCL)
private static volatile Singleton INSTANCE;

public static Singleton getInstance() {
    if (INSTANCE == null) {
        synchronized (Singleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new Singleton();
            }
        }
    }
    return INSTANCE;
}

Pros:
- Lazy
- Thread-safe
- Reduced locking

Cons:
- Complex
- Requires volatile

---

### Bill Pugh Singleton (Recommended)
public class Singleton {
    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}

Pros:
- Lazy
- Thread-safe
- No synchronization
- Clean

---

### Enum Singleton
public enum Singleton {
    INSTANCE;
}

Pros:
- Reflection safe
- Serialization safe
- Thread-safe

Cons:
- Not flexible
- Poor DI support

---

## 4. Common Pitfalls

### Race Condition
Shared mutable state leads to inconsistent data.

### Serialization Issue
Fix:
private Object readResolve() {
    return getInstance();
}

### Reflection Issue
Fix:
- Constructor guard
- Or use Enum

---

## 5. When to Use
- Config Manager
- Connection Pool Manager
- Thread Pool
- Cache
- RateLimiter

---

## 6. When NOT to Use
- User-specific data
- Request-scoped data
- Multi-tenant configs
- Mutable state

---

## 7. Spring Boot Mapping

Default:
@Service → Singleton bean

Why:
- Beans are stateless
- Better performance
- Less memory usage

Change scope:
@Scope("prototype")

Rule:
Singleton beans must be stateless

---

## 8. Connection Pool Insight
Wrong: Single DB connection  
Correct: Singleton pool + multiple connections

---

## 9. DCL vs Bill Pugh

Bill Pugh:
- Simple
- Safe
- Preferred

DCL:
- More control
- More complex
- Error-prone

---

## 10. Interview Answers

Which Singleton?
Use Spring Singleton.  
Manual → Bill Pugh.  
DCL only if needed.

Why Singleton?
Controlled access to shared expensive resources.

Biggest issue?
Race conditions due to shared state.

Why volatile?
Prevents instruction reordering.

---

## 11. Logger

Use:
- SLF4J / Log4j
- Spring managed

Avoid:
- DCL
- Custom Singleton

Reason:
Already handled by frameworks.

---

## Final Mental Model
Singleton = Controlled access to shared, expensive resource
