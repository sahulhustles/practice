# 10-Day Java 25 Learning Roadmap

**Duration:** 10 days  ·  **Time commitment:** 5 hours/day  ·  **Total:** 50 hours

This repository tracks a practical, project-driven Java learning sprint. Every day follows **learn → practise → build → commit**. The goal is to finish with strong Java fundamentals, a tested database-backed application, and enough JVM knowledge to continue into advanced Java.

> Use Java 25 (or a newer compatible JDK). The roadmap focuses on core Java first; do not rush ahead if the day's exercises are not working.

## How to use this repository

1. Create a GitHub repository, for example `java-10-day-challenge`.
2. Add this README and the `java-10-day-tracker.html` file.
3. Open the HTML tracker in a browser. Tick tasks as you complete them; checkmarks are saved in that browser's local storage.
4. Keep code in the suggested folders below, and commit your work every day.
5. At the end of each day, write a short reflection: what you learned, what was difficult, and what you need to revisit.

```text
java-10-day-challenge/
├── README.md
├── java-10-day-tracker.html
├── day-01/
├── day-02/
├── day-03/
├── day-04/
├── day-05/
├── day-06/
├── day-07/
├── day-08/
├── day-09/
└── day-10/
```

## Daily time structure

| Time | Activity |
|---|---|
| Hour 1 | Learn the concepts and take concise notes |
| Hour 2 | Follow small examples and experiment |
| Hour 3 | Complete focused exercises |
| Hour 4 | Build the day's practical deliverable |
| Hour 5 | Test, review, document and commit |

Do not spend all five hours watching tutorials. Keep at least three hours hands-on.

## Roadmap checklist

### Day 1 — Java setup, syntax and first programs
**Goal:** Understand the Java execution model and write small console programs.

**Hour 1 — Environment and execution**
- [ ] Verify Java 25 with java --version and javac --version.
- [ ] Understand JDK vs JVM vs JRE, source code, bytecode and compilation.
- [ ] Create a GitHub repository and a clean src/ and README.md structure.
- [ ] Compile and run a HelloWorld program using javac and java.

**Hour 2 — Variables and types**
- [ ] Learn primitive types, reference types, literals, type casting and var.
- [ ] Learn operators, precedence and integer division.
- [ ] Write small examples for every primitive type.

**Hour 3 — Input, output and strings**
- [ ] Use System.out, printf and Scanner.
- [ ] Learn String immutability, common String methods and text blocks.
- [ ] Build a command-line profile card that accepts user input.

**Hour 4 — Decisions and loops**
- [ ] Learn if/else, switch expressions, for, while and do-while.
- [ ] Use break and continue appropriately.
- [ ] Solve 8–10 small problems: even/odd, grade calculator, multiplication table, factorial and digit sum.

**Hour 5 — Practice and commit**
- [ ] Build a menu-driven unit converter or simple calculator.
- [ ] Test invalid input and boundary cases.
- [ ] Commit the day's work with a clear Git commit message.

**Deliverable:** A working console calculator or unit converter plus 8–10 small syntax exercises.

### Day 2 — Methods, arrays and problem solving
**Goal:** Break problems into reusable methods and process collections of values.

**Hour 1 — Methods**
- [ ] Learn method declarations, parameters, return values and method overloading.
- [ ] Understand pass-by-value in Java.
- [ ] Refactor Day 1 programs into small methods.

**Hour 2 — Arrays**
- [ ] Learn array creation, indexing, length and traversal.
- [ ] Work with 2D arrays and enhanced for loops.
- [ ] Implement min, max, sum, average and linear search.

**Hour 3 — Strings and algorithm patterns**
- [ ] Practice palindrome, anagram, character frequency and word counting.
- [ ] Learn StringBuilder and when to use it.
- [ ] Compare simple nested-loop solutions with more efficient approaches.

**Hour 4 — Recursion and basic complexity**
- [ ] Understand base cases and recursive calls.
- [ ] Implement factorial, Fibonacci and array sum recursively.
- [ ] Learn the intuition behind O(1), O(n), O(n log n) and O(n²).

**Hour 5 — Practice set**
- [ ] Solve at least 8 problems using methods and arrays.
- [ ] Write brief notes explaining the approach and complexity.
- [ ] Commit solutions under day-02/.

**Deliverable:** A collection of reusable methods and at least 8 solved array/string problems.

### Day 3 — Object-oriented programming
**Goal:** Model real entities using classes, objects and encapsulation.

**Hour 1 — Classes and objects**
- [ ] Learn fields, methods, object creation and references.
- [ ] Understand constructors, this and constructor overloading.
- [ ] Create Student, Book and BankAccount classes.

**Hour 2 — Encapsulation and access control**
- [ ] Learn private, public, protected and package-private access.
- [ ] Use getters, setters and validation in constructors.
- [ ] Protect object state with sensible invariants.

**Hour 3 — Inheritance and polymorphism**
- [ ] Learn extends, super, method overriding and dynamic dispatch.
- [ ] Understand final classes and methods.
- [ ] Build an Employee hierarchy and demonstrate runtime polymorphism.

**Hour 4 — Abstraction and interfaces**
- [ ] Learn abstract classes and interfaces.
- [ ] Understand default and static interface methods.
- [ ] Model payment methods or notification channels behind an interface.

**Hour 5 — OOP mini-project**
- [ ] Build a small library or banking application using multiple classes.
- [ ] Keep fields private and separate responsibilities.
- [ ] Draw or document the class relationships and commit.

**Deliverable:** A small multi-class OOP application with encapsulation, inheritance, interfaces and polymorphism.

### Day 4 — Core Java APIs, exceptions and packages
**Goal:** Write safer programs using standard APIs and structured error handling.

**Hour 1 — Packages and project structure**
- [ ] Learn package declarations, imports and naming conventions.
- [ ] Organize classes into packages.
- [ ] Compile and run a packaged project from the command line.

**Hour 2 — Exceptions**
- [ ] Understand checked vs unchecked exceptions.
- [ ] Use try, catch, finally, throw and throws.
- [ ] Create a meaningful custom exception.

**Hour 3 — Object and utility APIs**
- [ ] Understand equals, hashCode and toString contracts.
- [ ] Use Objects, Math, Random and UUID.
- [ ] Override equals and hashCode correctly in a domain class.

**Hour 4 — Date/time and enums**
- [ ] Use LocalDate, LocalTime, LocalDateTime and Duration.
- [ ] Learn enum types and switch over enums.
- [ ] Build a simple task deadline or booking model.

**Hour 5 — File I/O**
- [ ] Read and write text files with Files and Path.
- [ ] Use try-with-resources.
- [ ] Build a notes or expense tracker that persists data to a file.

**Deliverable:** A file-backed console application with packages, custom exceptions and date/time handling.

### Day 5 — Collections and generics
**Goal:** Choose the right data structure and write reusable type-safe code.

**Hour 1 — Collections overview**
- [ ] Understand Collection, List, Set, Queue and Map.
- [ ] Learn when to choose each interface.
- [ ] Compare ArrayList and LinkedList at a conceptual level.

**Hour 2 — Lists, sets and queues**
- [ ] Practice ArrayList, HashSet, LinkedHashSet and TreeSet.
- [ ] Practice ArrayDeque as a stack and queue.
- [ ] Remove duplicates while preserving order.

**Hour 3 — Maps and iteration**
- [ ] Practice HashMap, LinkedHashMap and TreeMap.
- [ ] Use entrySet, getOrDefault, putIfAbsent and computeIfAbsent.
- [ ] Build word-frequency and inventory-count programs.

**Hour 4 — Generics**
- [ ] Learn generic classes, methods and bounded type parameters.
- [ ] Understand wildcards: ?, extends and super.
- [ ] Build a generic Box or Repository class.

**Hour 5 — Collections challenge**
- [ ] Build a contact manager or inventory manager using collections.
- [ ] Support add, update, search, delete and list operations.
- [ ] Add at least 10 test cases and commit.

**Deliverable:** A CRUD-style console manager using List, Set, Map and at least one generic type.

### Day 6 — Modern Java, lambdas and streams
**Goal:** Use functional-style Java and modern language features confidently.

**Hour 1 — Lambdas and functional interfaces**
- [ ] Learn lambda syntax and functional interfaces.
- [ ] Use Predicate, Function, Consumer and Supplier.
- [ ] Write a few custom functional interfaces.

**Hour 2 — Method references and Optional**
- [ ] Practice static, bound and unbound method references.
- [ ] Use Optional safely for potentially absent values.
- [ ] Avoid using Optional as a blanket replacement for every nullable field.

**Hour 3 — Stream API**
- [ ] Practice filter, map, flatMap, sorted, distinct and limit.
- [ ] Use collect, toList, groupingBy and partitioningBy.
- [ ] Transform a list of objects into reports.

**Hour 4 — Modern Java language features**
- [ ] Explore records, sealed classes and pattern matching supported by Java 25.
- [ ] Use switch expressions and text blocks.
- [ ] Compare a record with a traditional data class.

**Hour 5 — Stream-based project**
- [ ] Build a student-result or sales-report processor.
- [ ] Filter, group, sort and aggregate data with streams.
- [ ] Document where streams improve readability and where loops are clearer.

**Deliverable:** A report generator using lambdas, streams, collectors, records and modern switch/pattern matching features.

### Day 7 — Generics deeper, concurrency and JVM fundamentals
**Goal:** Understand how Java runs and how threads share work safely.

**Hour 1 — Generics deeper**
- [ ] Review type bounds, generic methods and wildcard variance.
- [ ] Understand PECS: producer extends, consumer super.
- [ ] Implement a type-safe copy or transfer utility.

**Hour 2 — Threads and tasks**
- [ ] Learn Thread, Runnable and Callable.
- [ ] Use ExecutorService and Future.
- [ ] Run independent tasks and collect their results.

**Hour 3 — Synchronization**
- [ ] Understand race conditions, synchronized and volatile.
- [ ] Use AtomicInteger and concurrent collections.
- [ ] Build a counter test that demonstrates and then fixes a race condition.

**Hour 4 — JVM memory and garbage collection**
- [ ] Learn stack, heap, metaspace and object lifetime at a high level.
- [ ] Understand reachability and garbage collection; do not rely on System.gc().
- [ ] Use jcmd or Java Flight Recorder if available to inspect a running program.

**Hour 5 — Bytecode and JIT introduction**
- [ ] Compile a class and inspect it with javap -c -v.
- [ ] Identify method calls, fields and bytecode instructions.
- [ ] Understand interpretation, JIT compilation and why warm-up matters in benchmarks.

**Deliverable:** A multithreaded task runner, a race-condition demonstration and a short bytecode/JVM inspection note.

### Day 8 — Testing, debugging and build tools
**Goal:** Make code maintainable and verify behavior automatically.

**Hour 1 — Debugging**
- [ ] Use IDE breakpoints, step over, step into and variable inspection.
- [ ] Read stack traces from the top-level failure and locate the root cause.
- [ ] Fix three intentionally introduced bugs.

**Hour 2 — Unit testing with JUnit 5**
- [ ] Create a test source set and add JUnit 5 using Maven or Gradle.
- [ ] Write tests with @Test and assertions.
- [ ] Test normal, edge and invalid-input cases.

**Hour 3 — Test design**
- [ ] Learn Arrange–Act–Assert and parameterized tests.
- [ ] Test exceptions and boundary conditions.
- [ ] Aim for meaningful behavior coverage, not an arbitrary coverage percentage.

**Hour 4 — Maven or Gradle**
- [ ] Choose Maven for this roadmap and understand pom.xml.
- [ ] Run clean, compile, test and package.
- [ ] Understand dependencies, plugins and the standard project layout.

**Hour 5 — Quality and GitHub**
- [ ] Add a .gitignore and document build/run/test commands.
- [ ] Push a clean repository with meaningful commits.
- [ ] Review code for naming, duplication and method size.

**Deliverable:** A Maven Java project with automated JUnit tests, a reproducible build and clear GitHub documentation.

### Day 9 — Database connectivity and application design
**Goal:** Connect Java to a database and structure a small application cleanly.

**Hour 1 — SQL essentials**
- [ ] Review tables, primary keys, foreign keys and constraints.
- [ ] Practice SELECT, INSERT, UPDATE, DELETE, JOIN and indexes.
- [ ] Create a small database schema for the final project.

**Hour 2 — JDBC**
- [ ] Understand JDBC, Connection, PreparedStatement and ResultSet.
- [ ] Connect to a local database such as PostgreSQL or MySQL.
- [ ] Use prepared statements instead of concatenating SQL.

**Hour 3 — Transactions and resource safety**
- [ ] Understand auto-commit, commit and rollback.
- [ ] Use try-with-resources for JDBC resources.
- [ ] Handle SQL exceptions without hiding useful diagnostic details.

**Hour 4 — Layered design**
- [ ] Separate model, repository/DAO, service and application layers.
- [ ] Keep SQL out of user-interface code.
- [ ] Use interfaces where they clarify boundaries, not just for ceremony.

**Hour 5 — Database mini-project**
- [ ] Implement CRUD operations for one entity.
- [ ] Validate input and handle missing records.
- [ ] Write setup instructions and commit.

**Deliverable:** A Java JDBC CRUD application with a relational database and separated layers.

### Day 10 — Capstone, review and assessment
**Goal:** Combine the core skills into a polished project and identify next steps.

**Hour 1 — Plan the capstone**
- [ ] Choose a console-based expense tracker, library manager or task manager.
- [ ] Write requirements, entities, operations and acceptance criteria.
- [ ] Sketch the class and database design before coding.

**Hour 2 — Implement core features**
- [ ] Implement models, services and repository/data access.
- [ ] Add validation and exception handling.
- [ ] Keep methods focused and use collections appropriately.

**Hour 3 — Test and improve**
- [ ] Write JUnit tests for core business logic.
- [ ] Test invalid inputs, empty data and boundary cases.
- [ ] Fix bugs and remove duplicated code.

**Hour 4 — Package and document**
- [ ] Build the project with Maven.
- [ ] Write a useful README with features, prerequisites and run steps.
- [ ] Add sample data, screenshots or terminal output where useful.

**Hour 5 — Final assessment**
- [ ] Explain JVM/JDK/JRE, OOP, collections, generics, streams, exceptions and concurrency without notes.
- [ ] Solve 3 timed problems using arrays, strings and maps.
- [ ] Review all 10 days and create a next-30-days learning backlog.

**Deliverable:** A documented, tested Java capstone project published on GitHub and a personal list of topics to deepen.

## Git workflow

A simple daily workflow:

```bash
git status
git add .
git commit -m "day-01: complete Java syntax exercises"
git push origin main
```

Use a separate commit for meaningful milestones. Avoid committing generated `.class` files, IDE caches, build output or secrets.

Suggested `.gitignore`:

```gitignore
*.class
target/
build/
.idea/
.vscode/
*.iml
.DS_Store
```

## Completion criteria

- [ ] All 10 days completed, with roughly 5 focused hours per day.
- [ ] Daily deliverables are committed and pushed.
- [ ] The capstone builds successfully with Maven.
- [ ] JUnit tests pass.
- [ ] README includes setup, database configuration, build, test and run instructions.
- [ ] I can explain the major topics without copying notes.
- [ ] I have written a 30-day follow-up plan based on weak areas.

## Important expectations

- Ten days is an intensive foundation sprint, not mastery of the entire Java ecosystem.
- If a topic is difficult, spend the next day's first 30–45 minutes reviewing it rather than memorising answers.
- For JDBC, use a local database and never commit passwords or API keys.
- For concurrency and JVM experiments, use bounded workloads. Do not intentionally exhaust your machine's memory.
- Prefer readable, tested code over clever one-liners.

## Final capstone

Choose one: **Expense Tracker**, **Library Manager**, or **Task Manager**. It should include classes, collections, validation, exception handling, file or database persistence, a layered structure, and JUnit tests. The Day 10 version should be small and complete rather than large and unfinished.

## After the 10 days

Continue with deeper Java, SQL, Spring Boot, REST APIs, testing, security, Docker and deployment. Revisit JVM profiling and concurrency with dedicated projects instead of trying to master them in this sprint.
