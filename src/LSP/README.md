# Liskov Substitution Principle (LSP) – Bakery Example

## Principle Explanation

The **Liskov Substitution Principle (LSP)** states that:

> *Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.*

In practice, this means that subclasses should **behave consistently** with their base classes. Violating LSP can lead to runtime errors or unexpected behavior.

---

## Example Introduction

This example simulates a **bakery** with different types of desserts.

### Dirty Version
- The `Dessert` class defines a `bake()` method, which all desserts inherit.
- Subclasses:
    - `Cake` → Can be baked (inherits `bake()` without issue)
    - `IceCream` → Cannot be baked, but inherits `bake()` anyway and **throws an exception** when called
- **Problem:** The subclass (`IceCream`) violates LSP because it cannot fully substitute its base class (`Dessert`) without breaking the program.
- This design is **fragile**: using a dessert object without checking its type can lead to runtime errors.

### Clean Version
We refactored the design to respect LSP:

- Introduce a `Bakeable` interface for desserts that can be baked
- Subclasses:
    - `Cake` → Implements `Bakeable`
    - `IceCream` → Does **not** implement `Bakeable`
- The `Bakery` only calls `bake()` on desserts that are **bakeable**, preventing runtime exceptions.

**Benefits:**
- Subclasses can now be safely substituted for their base type or interface.
- Behavior is consistent, eliminating unexpected exceptions.
- The system is **robust** and adheres to LSP.

---

## Key Points

- **Behavior:** Dirty code may throw runtime exceptions; clean code ensures only valid operations are called.
- **Structure & Flexibility:**
    - Dirty code: all desserts inherit `bake()`, some subclasses cannot honor it, violating LSP
    - Clean code: only bakeable desserts implement `bake()`, preserving substitutability
- **Benefits of LSP-compliant design:**
    - Safer and predictable behavior
    - Easier to extend with new dessert types
    - Clearer separation of responsibilities

---

## Conclusion

Applying the **Liskov Substitution Principle** prevents unexpected runtime errors by ensuring that all subclasses can safely substitute their parent types.  
In the bakery example, this means desserts behave consistently: cakes can be baked, ice cream cannot, and the program remains robust and maintainable.