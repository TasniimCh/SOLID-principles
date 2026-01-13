# Open/Closed Principle (OCP) – Study Program Example

## Principle Explanation

The **Open/Closed Principle (OCP)** states that:

> *Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.*

In practice, this means you should be able to **add new functionality without changing existing code**, reducing the risk of introducing bugs and making the system more maintainable.

---

## Example Introduction

This example simulates a **study program** where courses and their tasks are displayed.

### Dirty Version
- The `StudyProgram` class handles **all courses directly** with conditional logic:
    - Checks course names using `if-else` statements
    - Prints course details inside the same method
- While functional, this design is **rigid**: adding a new course requires modifying the `showCourseDetails` method.
- This tightly couples the logic to specific courses, violating OCP. Any change to course handling could break existing functionality.

### Clean Version
We refactored the design to respect OCP:

- `Course` → Abstract base class defining a common interface for all courses
- `DataStructures`, `Algorithms`, `Programming` → Extend `Course` and implement their own details
- `StudyProgram` → Accepts any `Course` instance and displays its details

**Benefits:**
- The system is now **open for extension**: new courses can be added by creating new classes extending `Course`.
- The system is **closed for modification**: the `StudyProgram` class does not need to be changed to accommodate new courses.

---

## Key Points

- **Behavior:** Both versions display course details.
- **Structure & Flexibility:**
    - Dirty code: all-in-one, hard-coded course logic, requires modification for new courses
    - Clean code: follows OCP, easily extended with new courses, no changes to `StudyProgram`
- **Benefits of OCP-compliant design:**
    - New courses can be added independently
    - Reduces risk of breaking existing functionality
    - Encourages modular and maintainable code

---

## Conclusion

Applying the **Open/Closed Principle** transforms a rigid, hard-coded study program into a flexible system that can grow with new courses and tasks, while protecting existing code from modification-related errors.