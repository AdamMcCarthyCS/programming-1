## Notes on Workflow

- Starting 23/11/25, PR descriptions for this repository are generated using ChatGPT and a visual Git graph (`git log --all --decorate --oneline --graph`),
with commit subject lines manually entered in capitalized conventional commit format.
- Git versioning is used to maintain a neat record of work. This is **not** required for the course.
- **Important:** No code in this repository has been generated or edited by ChatGPT — only PR documentation is assisted.

# **Java Programming Portfolio — Labs 1 to 8**

### Higher Diploma in Computer Science (Conversion Course)

This repository documents the Java programming labs I have completed so far in the Higher Diploma in Computer Science.
Across these eight lab blocks, I progressed from writing simple programs to building multi-class, menu-driven applications with full CRUD functionality, validation, and documentation.
This README provides a clear overview of what I built in each lab and the skills I developed.

---

## **Lab 1 — Programming Fundamentals**

In the first lab, I focused on the basics of Java: variables, arithmetic, simple input/output, and printing.
I implemented small programs to update variables, perform arithmetic operations, demonstrate integer vs double division, and calculate geometric and financial values.
These exercises formed my foundation in:

* primitive types
* operators and expressions
* variable management
* formatted console output

---

## **Lab 2a — Conditional Logic**

This lab introduced decision-making using `if`, `else-if`, and boolean logic.
I wrote programs that classified values such as angles and grades, and implemented logical checks for user-driven scenarios.

I gained experience in:

* branching logic
* compound conditions
* boolean expressions
* input validation patterns

---

## **Lab 2b — Loops and Iteration**

In Lab 2b, I worked extensively with loops (`for`, `while`, and nested loops).
I built programs that printed sequences, countdowns, and patterns, and rewrote loops using different structures to develop flexibility.

I also implemented a number-guessing program that tracked attempts and handled user input.

Key skills developed:

* loop control variables
* sentinel values
* iterative algorithms
* nested loop construction

---

## **Lab 3a — Methods and Procedural Decomposition**

This lab focused on breaking problems into reusable methods.
I created methods with parameters, methods that returned values, and overloaded variations.
I also used the Scanner class for input-driven functionality such as greeting utilities and a rectangle calculator.

This strengthened my understanding of:

* method signatures
* scope
* functional decomposition
* method overloading

---

## **Lab 3b — Overloading, Recursion, and Multi-Method Design**

In Lab 3b, I deepened my understanding of method design by implementing:

* recursive factorial and Fibonacci methods
* overloaded arithmetic and cube functions
* a multi-method FortuneTeller application using user input and randomisation

This lab pushed me to think algorithmically, handle branching logic inside methods, and test behaviour through structured Driver classes.

---

## **Lab 4a — Arrays and Data Processing**

Lab 4a was my first structured work with arrays.
I wrote programs to:

* read integers into arrays
* print them in various orders
* compute averages
* filter wage values
* find maximum values

I learned how to structure loops around arrays, separate reading/processing/output stages, and write clearer array-driven logic.

---

## **Lab 4b — String and Character Manipulation**

This lab introduced more advanced String handling.
I implemented programs to:

* check palindromes
* compare strings lexicographically
* extract substrings
* count vowels and consonants

These tasks built confidence with Java’s String API and character-level algorithms.

---

## **Lab 5a — Introduction to OOP and Encapsulation**

Lab 5a marked the beginning of object-oriented programming.
I created several versions of a BankAccount class using:

* private fields
* constructors (including overloaded forms)
* getters and setters
* validation rules
* custom `toString()` output

I also completed TicketMachine exercises to reinforce internal state modelling and method-driven behaviour.

Skills gained:

* encapsulation
* data validation
* constructor design
* object modelling

---

## **Lab 5b — Multi-Class Modelling and Behaviour Testing**

In Lab 5b, I designed multiple interacting classes including:

* a CoffeeCup class with fill/drink behaviour
* a Book class with sales tracking
* a Calculator with method overloading

I used Driver classes to thoroughly test object behaviour and improve program structure.

Skills strengthened:

* class collaboration
* designing stateful objects
* systematic testing via Driver programs

---

## **Lab 6a — Project Evolution and Refactoring**

Lab 6a required evolving a multi-version BankAccount project.
Across successive versions, I added:

* deposit and withdraw functionality
* full accessor/mutator methods
* validation logic
* constructor refactoring using `this`
* print-based tests verifying behaviour

This lab emphasised refactoring, maintainability, and iterative software evolution.

---

## **Lab 6b — Validation, Documentation, and Defensive Programming**

In this lab, I built a GymMember class with strict validation rules for:

* name length
* height and weight ranges
* membership number range

I added full JavaDoc across constructors, fields, and methods.
This improved my ability to design robust, well-documented classes that guard against invalid state.

---

## **Lab 7a — Store Application (Part 1): ArrayLists and Aggregation**

Lab 7a was a larger application built around an ArrayList-based Store.
I implemented functionality to:

* add products
* list products in a formatted way
* calculate average prices
* find the cheapest product
* filter products by price

I also developed a menu-driven UI and improved output readability.

Key learning outcomes:

* ArrayList operations
* aggregation methods
* user-driven program flow
* structured formatting

---

## **Lab 7b — NewsFeed Application (Part 1): Data Structures and Menu Logic**

In Lab 7b, I developed a NewsFeed application using three interacting classes:
`MessagePost`, `NewsFeed`, and `Driver`.

I implemented:

* message posting
* listing stored posts
* ArrayList management
* a looping menu and UI integration

This strengthened my understanding of object collaboration and multi-class program architecture.

---

## **Lab 8a — Full CRUD Implementation and Cross-Class Coordination**

Lab 8a was the most comprehensive lab so far, combining everything learned to implement full CRUD functionality for two applications: NewsFeed and Store.

### **NewsFeed Enhancements**

I added:

* update and delete post functionality
* index validation methods
* methods for retrieving posts and counts
* improved display formatting
* empty-state handling
* JavaDoc documentation
* main menu extensions
* Driver-level UI handlers

### **Store Enhancements**

I implemented:

* update and delete product functionality
* index and ArrayList validation
* helper methods in the Driver class
* new menu options
* public accessors in Store for safer access
* integration of CRUD operations into the run loop

This lab brought together OOP design, data structure manipulation, input validation, and user interaction design into complete, maintainable applications.

---

## **Summary of Skills Developed Across Labs**

Through Labs 1 to 8, I have developed strong competencies in:

### **Programming & Algorithms**

* Control flow, recursion, loops
* Arrays and ArrayLists
* Iterative and selection-based logic

### **Object-Oriented Programming**

* Class design and encapsulation
* Constructors and overloading
* Validation and defensive programming
* Multi-class collaboration

### **Software Engineering Practices**

* Refactoring and multi-version project evolution
* JavaDoc documentation
* Clean, maintainable code structure
* Conventional Commit usage
* Menu-driven UI architecture

### **Application Development**

* CRUD implementation
* Structured input handling
* User experience considerations in console applications
* Clear separation of concerns (UI vs logic)

---

## **Overall Reflection**

These labs represent my progression from introductory Java programs to building full-featured, modular applications with robust input handling and clear class responsibilities.
The work reflects my focus on maintainability, validation, documentation, and correct use of object-oriented principles.

