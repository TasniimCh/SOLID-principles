# Dependency Inversion Principle (DIP) – Laptop Example

## Principle Explanation

The **Dependency Inversion Principle (DIP)** states that:

> *High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).  
> Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.*

In practice, this means that **high-level classes should not be tightly coupled to specific implementations** of lower-level classes, making the system more flexible and maintainable.

---

## Example Introduction

This example simulates a **laptop assembly** with different hardware components.

### Dirty Version
- The `Laptop` class depends directly on **concrete components**:
    - `IntelCPU`
    - `NvidiaGPU`
    - `CorsairRAM`
- While functional, this design is **tightly coupled**:
    - Swapping a CPU, GPU, or RAM requires modifying the `Laptop` class.
    - High-level logic (Laptop) depends directly on low-level details (specific components), violating DIP.

### Clean Version
We refactored the design to respect DIP:

- Define **abstractions** (interfaces):
    - `IProcessor` → CPU abstraction
    - `IGraphics` → GPU abstraction
    - `IMemory` → RAM abstraction
- High-level module (`Laptop`) depends on these **abstractions**, not concrete implementations.
- Concrete components (`IntelCPU`, `AMDCPU`, `NvidiaGPU`, `CorsairRAM`) implement the respective interfaces.
- Components can now be **swapped easily** without modifying the `Laptop` class.

**Benefits:**
- Decouples high-level logic from low-level details
- Increases flexibility: laptops can be configured with different components
- Improves maintainability and testability

---

## Key Points

- **Behavior:** Both versions start the laptop successfully.
- **Structure & Flexibility:**
    - Dirty code: tightly coupled, changing components requires modifying Laptop
    - Clean code: depends on abstractions, components can be swapped freely
- **Benefits of DIP-compliant design:**
    - Easy to extend with new CPUs, GPUs, or RAM modules
    - High-level module (`Laptop`) is decoupled from low-level implementation
    - Encourages modular, maintainable, and flexible code

---

## Conclusion

Applying the **Dependency Inversion Principle** transforms a rigid, tightly coupled laptop system into a modular and flexible design.  
High-level modules rely on abstractions, enabling easy substitution of components and promoting maintainable, scalable architecture.