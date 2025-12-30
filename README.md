# SOLID Design Principles

This repository contains examples of the five SOLID design principles of object-oriented programming. The examples are written in Java. Each example has a "clean" and "dirty" version to demonstrate adherence to and violation of the principle, respectively.

## Principles and Example Scenarios

- **Single Responsibility Principle (SRP)**  
  *Example:* Coffee shop simulation.
    - Dirty: One `CoffeeMachine` class handles orders, brewing, notifications, and cleaning.
    - Clean: Separate classes for `CoffeeMachine` (brewing), `Barista` (workflow coordination), `Notifier`, and `Cleaner`.

- **Open/Closed Principle (OCP)**  
  *Example:* Course scheduler.
    - Dirty: All courses defined in one file; adding a new course requires modifying existing code.
    - Clean: Each course implements a `Course` interface; scheduler works with the interface, allowing new courses to be added without changing existing code.

- **Liskov Substitution Principle (LSP)**  
  *Example:* Pastry baking.
    - Dirty: Subclass `FrozenPastry` breaks the `bake()` method.
    - Clean: Only bakeable pastries implement the `Bakeable` interface; all pastries can be used interchangeably in baking workflows.

- **Interface Segregation Principle (ISP)**  
  *Example:* Pet interaction.
    - Dirty: One interface `Pettable` forces all animals to implement irrelevant methods.
    - Clean: Separate interfaces `PettableCat`, `PettableDog`, `PettableBird`; each pet implements only relevant methods.

- **Dependency Inversion Principle (DIP)**  
  *Example:* Laptop and computer components.
    - Dirty: `Laptop` class depends directly on concrete CPU, GPU, and RAM classes.
    - Clean: `Laptop` depends on abstraction interfaces `IProcessor`, `IGraphics`, `IMemory`; components can be swapped without modifying the laptop code.

## Demo Concept

The demos together tell a simple, coherent story: 
a software engineering student spends a day studying in a coffee shop, sipping coffee (SRP), following a course schedule (OCP), enjoying pastries (LSP), petting a companion animal (ISP), and working on a modular laptop (DIP). Each scenario illustrates a principle in a fun and relatable way.
