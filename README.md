# 10-Day Java Learning Roadmap

A hands-on, checklist-based plan to learn Java in **10 days**, studying
**5 hours per day** (50 hours total).

-   **Target:** Beginner to practical Java foundations
-   **Java version:** JDK 25
-   **Tracking:** GitHub Issues / daily commits / this checklist
-   **Approach:** Learn concepts, write code, solve problems, build
    small projects

> The goal is not to master all of Java in 10 days. The goal is to build
> a strong foundation and finish with a working, documented Java
> project.

## Daily study schedule (5 hours)

  Activity                                    Time
  ---------------------------------- -------------
  Learn concepts                            1 hour
  Study examples and documentation      30 minutes
  Hands-on coding                          2 hours
  Coding challenges                         1 hour
  GitHub commits and revision           30 minutes
  **Total**                            **5 hours**

------------------------------------------------------------------------

## Day 1 --- Java Fundamentals

-   [ ] Understand JDK, JRE, JVM, and the Java compilation process.
-   [ ] Install and configure JDK 25.
-   [ ] Verify `java --version` and `javac --version`.
-   [ ] Understand Java program structure and the `main` method.
-   [ ] Learn variables and primitive data types.
-   [ ] Learn type casting and operators.
-   [ ] Read console input using `Scanner`.
-   [ ] Learn `String` and common String methods.
-   [ ] Build a command-line calculator.
-   [ ] Solve 10 basic programming problems.

**Deliverable:** Calculator and a collection of basic Java exercises.

## Day 2 --- Control Flow and Methods

-   [ ] Learn `if`, `else if`, and `switch`.
-   [ ] Learn `for`, `while`, and `do-while` loops.
-   [ ] Understand `break` and `continue`.
-   [ ] Declare and call methods.
-   [ ] Understand parameters and return values.
-   [ ] Practice method overloading.
-   [ ] Understand variable scope.
-   [ ] Implement a recursive method.
-   [ ] Build a number guessing game.
-   [ ] Solve 10 loop and method problems.

**Deliverable:** Number guessing game.

## Day 3 --- Arrays and Strings

-   [ ] Create and initialize one-dimensional arrays.
-   [ ] Work with multidimensional arrays.
-   [ ] Traverse, update, insert, and search array elements.
-   [ ] Implement linear search and binary search.
-   [ ] Implement basic sorting algorithms (bubble, selection,
    insertion).
-   [ ] Understand String immutability.
-   [ ] Practice `StringBuilder` and `StringBuffer`.
-   [ ] Understand `equals()` versus `==`.
-   [ ] Solve 10 array and String problems.

**Deliverable:** Array and String problem collection.

## Day 4 --- Object-Oriented Programming

-   [ ] Understand classes and objects.
-   [ ] Create constructors and overloaded constructors.
-   [ ] Understand the `this` keyword.
-   [ ] Learn static variables and methods.
-   [ ] Apply encapsulation.
-   [ ] Use getters and setters appropriately.
-   [ ] Understand access modifiers.
-   [ ] Organize code using packages and imports.
-   [ ] Build a Student Management System.

**Deliverable:** Student Management System.

## Day 5 --- Advanced OOP

-   [ ] Understand inheritance.
-   [ ] Practice method overriding.
-   [ ] Understand polymorphism.
-   [ ] Compare compile-time and runtime polymorphism.
-   [ ] Create abstract classes.
-   [ ] Create and implement interfaces.
-   [ ] Explore `default` and `static` interface methods.
-   [ ] Understand the `final` keyword.
-   [ ] Compare composition and inheritance.
-   [ ] Build an object-oriented Banking System.

**Deliverable:** Banking System with accounts and basic transactions.

## Day 6 --- Collections and Generics

-   [ ] Understand the Java Collections Framework.
-   [ ] Practice `ArrayList` and `LinkedList`.
-   [ ] Practice `HashSet` and `TreeSet`.
-   [ ] Practice `HashMap` and `TreeMap`.
-   [ ] Iterate using `Iterator` and enhanced `for`.
-   [ ] Understand `Comparable` and `Comparator`.
-   [ ] Create generic classes and methods.
-   [ ] Understand bounded type parameters and wildcards.
-   [ ] Learn basic Big-O time complexity.
-   [ ] Build a Contact Management application using collections.

**Deliverable:** Contact Management System.

## Day 7 --- Exception Handling and File I/O

-   [ ] Understand the Java exception hierarchy.
-   [ ] Use `try`, `catch`, and `finally`.
-   [ ] Understand `throw` and `throws`.
-   [ ] Compare checked and unchecked exceptions.
-   [ ] Create custom exceptions.
-   [ ] Explore the `File` and `Path` APIs.
-   [ ] Read files using `BufferedReader`.
-   [ ] Write files using `BufferedWriter`.
-   [ ] Understand basic serialization concepts.
-   [ ] Build a file-based Expense Tracker.

**Deliverable:** Expense Tracker that saves and loads data from files.

## Day 8 --- Functional Java

-   [ ] Understand lambda expressions.
-   [ ] Learn functional interfaces.
-   [ ] Practice `Predicate`, `Function`, `Consumer`, and `Supplier`.
-   [ ] Understand method references.
-   [ ] Learn the Stream API.
-   [ ] Practice `filter()`, `map()`, and `reduce()`.
-   [ ] Practice `sorted()`, `distinct()`, and `collect()`.
-   [ ] Understand `Optional`.
-   [ ] Compare intermediate and terminal stream operations.
-   [ ] Solve 10 Stream API challenges.

**Deliverable:** A data-processing application using Streams.

## Day 9 --- Multithreading and JVM Fundamentals

-   [ ] Understand processes versus threads.
-   [ ] Create threads using `Thread` and `Runnable`.
-   [ ] Understand the thread lifecycle.
-   [ ] Practice synchronization using `synchronized`.
-   [ ] Understand race conditions and deadlocks.
-   [ ] Learn `ExecutorService`.
-   [ ] Practice `Callable` and `Future`.
-   [ ] Understand heap and stack memory.
-   [ ] Learn garbage collection fundamentals.
-   [ ] Understand JIT compilation at a high level.
-   [ ] Inspect compiled bytecode using `javap`.
-   [ ] Run a basic multithreading experiment.

**Deliverable:** Multithreaded task-processing application.

## Day 10 --- Testing and Final Project

-   [ ] Understand Maven and its project structure.
-   [ ] Understand dependencies and `pom.xml`.
-   [ ] Set up JUnit 5.
-   [ ] Write unit tests for important methods.
-   [ ] Practice debugging with breakpoints.
-   [ ] Learn basic logging.
-   [ ] Review OOP, collections, exceptions, and Streams.
-   [ ] Refactor code into meaningful packages.
-   [ ] Write a useful README for the project.
-   [ ] Complete, run, and test the final project.
-   [ ] Push the finished project to GitHub.

**Deliverable:** A complete, tested, documented Java application.

------------------------------------------------------------------------

## Final project --- Personal Task Manager

Build a command-line task manager that combines the concepts from the
roadmap.

### Core requirements

-   [ ] Add a task with title, description, priority, and due date.
-   [ ] List all tasks.
-   [ ] Update task details.
-   [ ] Mark a task as completed.
-   [ ] Delete a task.
-   [ ] Filter tasks by status or priority.
-   [ ] Store tasks in a local file.
-   [ ] Load saved tasks when the application starts.
-   [ ] Validate user input and handle errors.
-   [ ] Use classes, interfaces, and encapsulation.
-   [ ] Use collections to manage tasks.
-   [ ] Use Streams for filtering and sorting.
-   [ ] Add unit tests with JUnit 5.
-   [ ] Document how to compile and run the project.

### Suggested package structure

``` text
java-task-manager/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/taskmanager/
│   │           ├── Main.java
│   │           ├── model/
│   │           │   └── Task.java
│   │           ├── service/
│   │           │   └── TaskService.java
│   │           ├── repository/
│   │           │   └── TaskRepository.java
│   │           └── util/
│   │               └── InputValidator.java
│   └── test/
│       └── java/
├── data/
├── README.md
└── pom.xml
```

Treat this as a suggested structure; introduce packages gradually rather
than creating empty files on day one.

------------------------------------------------------------------------

## GitHub tracking

### Suggested repository structure

``` text
10-days-of-java/
├── README.md
├── day-01-fundamentals/
├── day-02-control-flow-methods/
├── day-03-arrays-strings/
├── day-04-oop/
├── day-05-advanced-oop/
├── day-06-collections-generics/
├── day-07-exceptions-file-io/
├── day-08-functional-java/
├── day-09-concurrency-jvm/
└── day-10-final-project/
```

### Daily Git workflow

At the end of every study session:

``` bash
git status
git add .
git commit -m "Day 01: Complete Java fundamentals"
git push origin main
```

Use meaningful commit messages, for example:

-   `Day 01: Add calculator and primitive type exercises`
-   `Day 04: Implement student management system`
-   `Day 07: Add file persistence to expense tracker`
-   `Day 10: Complete task manager and unit tests`

### Daily progress log

Copy this template into a `PROGRESS.md` file and update it each day:

``` markdown
## Day X — Topic

- [ ] Concepts completed
- [ ] Coding exercises completed
- [ ] Mini-project completed
- [ ] Code pushed to GitHub

### What I learned
-

### Problems I faced
-

### What I need to revise
-

### Time spent
5 hours
```

### Completion tracker

-   [ ] Day 1 --- Fundamentals
-   [ ] Day 2 --- Control Flow and Methods
-   [ ] Day 3 --- Arrays and Strings
-   [ ] Day 4 --- OOP
-   [ ] Day 5 --- Advanced OOP
-   [ ] Day 6 --- Collections and Generics
-   [ ] Day 7 --- Exceptions and File I/O
-   [ ] Day 8 --- Functional Java
-   [ ] Day 9 --- Multithreading and JVM
-   [ ] Day 10 --- Testing and Final Project

------------------------------------------------------------------------

## Recommended learning resources

1.  [dev.java --- Official Java learning
    resources](https://dev.java/learn/)
2.  [Java 25 Documentation](https://docs.oracle.com/en/java/javase/25/)
3.  [Java Language
    Specification](https://docs.oracle.com/javase/specs/jls/se25/html/)
4.  [JUnit 5 User
    Guide](https://junit.org/junit5/docs/current/user-guide/)
5.  [Maven Getting Started
    Guide](https://maven.apache.org/guides/getting-started/)

## Rules to follow

1.  Write code every day. Do not just watch tutorials.
2.  Attempt exercises yourself before looking at solutions.
3.  Do not copy-paste complete projects without understanding them.
4.  Commit your work daily, even if you have not completed every task.
5.  Maintain a list of mistakes and concepts that need revision.
6.  Do not rush through OOP. It is one of the most important parts of
    Java.
7.  At the end of Day 10, explain your final project without referring
    to the source code.

## What success looks like after 10 days

By the end of this plan, you should be able to:

-   Write Java programs independently.
-   Understand and apply object-oriented programming.
-   Work with collections, generics, and Streams.
-   Handle exceptions and persist data using files.
-   Understand basic concurrency and JVM concepts.
-   Create and test a structured Java application.
-   Use Git and GitHub to document your learning.

**Remember:** 50 focused hours can establish a solid foundation, but
fluency comes from continued practice. Keep building projects after Day
10.
