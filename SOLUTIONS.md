# SOLUTIONS.md – Reflections on Junior Java Developer Skills Assessment

This document reflects on the **Junior Java Developer Skills Assessment** project. It outlines what I learned, the challenges I faced, how I tested my code, and areas I plan to improve.

---

## 🧠 What I Learned

### 1. Enhanced Loop Proficiency  
I gained a better appreciation for the **for-each loop** when working with arrays and collections, especially when the index isn’t required.

### 2. Precise String Handling  
I learned the difference between `String.isBlank()` and `String.isEmpty()`. Understanding that `isBlank()` checks for whitespace made input validation more effective.

### 3. Object-Oriented Encapsulation  
By using the `protected` access modifier, I understood how to allow subclass access within the same package while still maintaining encapsulation.

### 4. Static vs. Instance Members  
I clarified the use of `static` for class-level data/methods and instance members for object-specific behavior.

---

## 🚧 Challenges Faced

### 1. Variable Initialization Logic  
Initializing variables like `highestPaidName` and `lowestPaidName` required defensive programming to avoid logic errors.

### 2. Robust Arithmetic Handling  
I encountered division-by-zero errors during average calculations, which emphasized the importance of input validation.

### 3. Git Branching Workflow  
At one point, I mistakenly renamed a branch to `main` locally instead of pushing a feature branch. This helped me understand proper Git workflows and naming strategies.

---

## 🧪 How I Tested My Code

### 1. Command-Line Execution  
Ran each class manually using the `main` method to test functionality.

### 2. Scenario-Based Input  
Tested with various types of input: valid data, invalid formats, and edge cases (like empty strings and zero values).

### 3. Print Statement Debugging  
Used `System.out.println()` to inspect variable values and understand program flow during debugging.

---

## 🚀 One Thing I Want to Improve

The biggest area for improvement is **Automated Unit Testing**.

Although manual testing worked, it's not scalable. My goal is to:

- **Ensure correctness** by verifying each method in isolation.  
- **Prevent regressions** when code changes.  
- **Write cleaner, testable code** through better structure and modularity.

I plan to start integrating **JUnit** into future projects to build more reliable and maintainable applications.

---
