# Single Responsibility Principle (SRP) – Coffee Machine Example

## Principle Explanation

The **Single Responsibility Principle (SRP)** states that a class should have **only one reason to change**.  
Each class should focus on a **single responsibility**, which improves maintainability, readability, and flexibility.

---

## Example Introduction

This example simulates a **coffee shop workflow**.

### Dirty Version
- `CoffeeMachine` handles multiple responsibilities:
    - Taking orders
    - Brewing coffee
    - Notifying the user
    - Cleaning the machine
- While functional, this design is **tightly coupled**: any change in one area (e.g., notifications) requires modifying the same class, making maintenance harder.

### Clean Version
We refactored the design to respect SRP:

- `CoffeeMachine` → Manages brewing and machine state only
- `Barista` → Takes orders and prepares ingredients
- `Notifier` → Handles user notifications
- `Cleaner` → Cleans the machine

Each class now has a **single responsibility**, making the system more modular and easier to maintain.

---

## Key Points

- **Behavior:** The observable behavior (brewing coffee, notifying the user, cleaning) is the same between dirty and clean versions.
- **Structure & Flexibility:**
    - Dirty code: all-in-one, tightly coupled, hard to extend
    - Clean code: responsibilities separated, easy to extend or modify without affecting unrelated parts
- **Benefits of SRP-compliant design:**
    - Easier to test each component independently
    - Changes in notifications or cleaning do not affect brewing logic
    - Clearer, maintainable, and scalable codebase

---

## Conclusion

Even in a small system like a coffee machine, applying SRP **prevents future problems**, improves flexibility, and produces a professional, maintainable codebase.
