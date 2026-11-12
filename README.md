# Java in 10 Days

A focused, hands-on plan to build a solid foundation in **Core Java** over ten days.

| Plan | Details |
|---|---|
| Dates | **13–22 November 2026** |
| Duration | **10 days · 5 hours per day · 50 hours total** |
| Java version | **JDK 21 (LTS)** |
| Focus | Core Java, OOP, collections, streams, file I/O, concurrency, Maven, JUnit, and JDBC |
| Final outcome | A small, tested Java application published on GitHub |

The goal is to become productive with Java fundamentals in 50 focused hours. **Spring Boot and interview-level DSA are intentionally left for the next stage.** Day 10 includes a gap check and a decision about what to study next.

---

## Learning approach

Each day is divided into focused blocks. The first nine days use the same structure:

| Block | Time | Purpose |
|---|---:|---|
| Learn | 1 h 30 min | Understand the day's concepts and work through examples |
| Practice | 2 h | Solve exercises and reinforce the concepts |
| Build | 1 h | Apply the concepts in a small feature or program |
| Review | 30 min | Recall what you learned, identify gaps, and commit your work |
| **Total** | **5 hours** | |

Day 10 has a capstone-focused schedule:

| Block | Time |
|---|---:|
| Plan | 30 min |
| Build | 2 h 30 min |
| Practice | 1 h |
| Review | 1 h |
| **Total** | **5 hours** |

## Ground rules

1. **Type every example yourself.** Copy-pasting does not build fluency.
2. **Use the 20-minute rule.** When stuck for 20 minutes, look up the concept or solution, then redo the problem from a blank file.
3. **Commit to Git every day.** Push your progress with clear commit messages.
4. **Protect the Build block.** If you fall behind, reduce Practice tasks rather than skipping the day's build.
5. **Review actively.** Explain concepts aloud and redo selected problems without referring to your notes.

---

## The 10-day roadmap

### Day 1 — Friday, 13 November: Setup and syntax

**Goal:** Write and run a program that reads input, branches, and loops without looking up the syntax.

**Learn — 90 min**
- [ ] Install JDK 21 (LTS); verify with `java -version` and `javac -version`.
- [ ] Set up IntelliJ IDEA Community or VS Code with the Java Extension Pack; run Hello World.
- [ ] Understand how Java code runs: source file, `javac`, bytecode, and JVM. Know the difference between JDK, JRE, and JVM.
- [ ] Study primitive types, `String`, `var`, casting, `final` constants, and integer vs. floating-point division.
- [ ] Learn operators, `if`/`else`, `switch`, and `for`, `while`, and `do-while` loops.
- [ ] Read input with `Scanner`, including numbers and full lines.

**Practice — 120 min**
- [ ] Solve at least 15 CodingBat Java problems from Warmup-1 and Logic-1.
- [ ] Print a right triangle, pyramid, and diamond using nested loops.
- [ ] Implement prime checking, factorial, Fibonacci series, digit sum, and number reversal.
- [ ] Port a small script you have written in another language to Java; note what changed.

**Build — 60 min**
- [ ] Create a number-guessing game with a `Random` secret, attempt counter, higher/lower hints, and play-again loop.
- [ ] Create a menu-driven calculator using `switch` in a loop until the user quits.

**Review — 30 min**
- [ ] Write five lines of notes about what surprised you about Java syntax.
- [ ] Create a GitHub repository named `java-10-days` and push today's code with a clear commit message.

### Day 2 — Saturday, 14 November: Methods, arrays, and strings

**Goal:** Solve basic array and string problems using your own helper methods.

**Learn — 90 min**
- [ ] Study methods: parameters, return types, overloading, and varargs.
- [ ] Understand pass-by-value in Java for primitives and object references.
- [ ] Learn 1D and 2D arrays, enhanced `for` loops, and `Arrays` methods: `sort`, `fill`, `toString`, and `copyOf`.
- [ ] Study `String` immutability, the string pool, `equals` vs. `==`, and common `String` methods.
- [ ] Learn `StringBuilder` and when to use it instead of `+` inside a loop.

**Practice — 120 min**
- [ ] Solve at least 15 problems across CodingBat String-1 and Array-1.
- [ ] Reverse an array in place; find its maximum and second maximum; rotate an array by `k`.
- [ ] Implement palindrome and anagram checks, plus character frequency with an `int[26]`.
- [ ] For a matrix, implement transpose, row sums, and column sums.

**Build — 60 min**
- [ ] Build a text analyser that reads a sentence and prints the word count, longest word, vowel count, and words in reverse order.

**Review — 30 min**
- [ ] Explain why two equal strings can fail `==`; write a test that demonstrates it.
- [ ] Redo one string problem with `StringBuilder`, then commit your work.

### Day 3 — Sunday, 15 November: Classes and objects

**Goal:** Model a real-world entity as a class with proper encapsulation.

**Learn — 90 min**
- [ ] Study classes vs. objects, fields, methods, and constructors: default, parameterised, and chained with `this(...)`.
- [ ] Learn `this`, `static` fields, methods, and blocks.
- [ ] Study access modifiers, encapsulation, getters, and setters.
- [ ] Organise code into packages such as `model` and `app`; understand packages and imports.
- [ ] Learn about `final` fields and immutable classes.
- [ ] Understand memory basics: stack vs. heap, references, and garbage collection.

**Practice — 120 min**
- [ ] Write `Student`, `Rectangle`, and `Employee` classes with constructors and `toString()`.
- [ ] Use a `static` counter to track how many objects have been created.
- [ ] Write an immutable `Point` class with a `distanceTo` method.
- [ ] Create an array of `Student` objects and sort it by marks without using `Arrays.sort`.

**Build — 60 min**
- [ ] Build a `BankAccount` class with deposit, withdraw, and balance checks. Write a `Main` class that runs five operations.

**Review — 30 min**
- [ ] Sketch the stack and heap for `Student s = new Student(...)` and explain it aloud.
- [ ] Commit and push your work.

### Day 4 — Monday, 16 November: Inheritance and polymorphism

**Goal:** Design a small class hierarchy and explain when you would choose an interface or an abstract class.

**Learn — 90 min**
- [ ] Study inheritance, `super`, and method overriding with `@Override`; distinguish overriding from overloading.
- [ ] Learn polymorphism, upcasting, downcasting, and `instanceof`.
- [ ] Compare abstract classes and interfaces, including `default` and `static` interface methods.
- [ ] Study `Object` methods: `equals`, `hashCode`, and `toString`; understand why `equals` and `hashCode` belong together.
- [ ] Explore nested, inner, and anonymous classes.
- [ ] Learn `enum` types with fields, constructors, and methods.

**Practice — 120 min**
- [ ] Create an abstract `Shape` class with `area()`, implemented by `Circle`, `Rectangle`, and `Triangle`.
- [ ] Create a `Payable` interface implemented by two unrelated classes.
- [ ] Override `equals` and `hashCode` in a class and test its behaviour in a `HashSet`.
- [ ] Predict the output of five snippets involving overriding and static dispatch, then run them.

**Build — 60 min**
- [ ] Extend the bank app with `SavingsAccount` and `CurrentAccount` subclasses and a `Transferable` interface.

**Review — 30 min**
- [ ] Write a short comparison of abstract classes vs. interfaces, and composition vs. inheritance.
- [ ] Commit and push your work.

### Day 5 — Tuesday, 17 November: Exceptions and core collections

**Goal:** Handle errors cleanly and choose the right `List` or `Set` for a task.

**Learn — 90 min**
- [ ] Study the exception hierarchy: `Throwable`, `Exception`, and `RuntimeException`; compare checked and unchecked exceptions.
- [ ] Learn `try`/`catch`/`finally`, multi-catch, try-with-resources, and `throw` vs. `throws`.
- [ ] Create and use custom exceptions.
- [ ] Study wrapper classes, autoboxing, and the `Integer` cache gotcha with `==`.
- [ ] Learn generics: generic classes, generic methods, and wildcards.
- [ ] Compare `ArrayList` and `LinkedList`; study `HashSet`, `LinkedHashSet`, `TreeSet`, and `Iterator`.

**Practice — 120 min**
- [ ] Write `InsufficientFundsException` and use it in `withdraw`.
- [ ] Remove duplicates from a list with a `Set` while preserving the original order.
- [ ] Find the common elements of two lists.
- [ ] Write a generic `Pair<A, B>` class and a generic `max` method.
- [ ] Intentionally trigger five different exceptions and read each stack trace.

**Build — 60 min**
- [ ] Add exception handling and an `ArrayList<Account>` to the bank app. Support adding, finding, and removing accounts.

**Review — 30 min**
- [ ] Explain checked vs. unchecked exceptions with one example of each.
- [ ] Commit and push your work.

### Day 6 — Wednesday, 18 November: Maps, queues, and sorting

**Goal:** Choose the right collection for a problem and sort with a `Comparator`.

**Learn — 90 min**
- [ ] Study `HashMap`, `LinkedHashMap`, and `TreeMap`; iterate with `entrySet` and learn `getOrDefault`, `merge`, and `computeIfAbsent`.
- [ ] Learn `Queue`, `Deque`, `ArrayDeque`, and `PriorityQueue`; understand why `Deque` replaces `Stack`.
- [ ] Compare `Comparable` and `Comparator`; explore the `Collections` utility class.
- [ ] Understand `HashMap` internals: hashing, buckets, collisions, and load factor.

**Practice — 120 min**
- [ ] Solve Two Sum with a `HashMap`.
- [ ] Group anagrams together.
- [ ] Solve Valid Parentheses using a `Deque`.
- [ ] Find the Top K frequent elements using a `PriorityQueue`.
- [ ] Sort students by marks and then by name using a `Comparator`.

**Build — 60 min**
- [ ] Build a word-frequency counter that reads a block of text and prints the ten most common words.

**Review — 30 min**
- [ ] Write a time-complexity table for `ArrayList`, `LinkedList`, `HashMap`, `TreeMap`, and `PriorityQueue`.
- [ ] Commit and push your work.

### Day 7 — Thursday, 19 November: Lambdas and streams

**Goal:** Rewrite loops as stream pipelines and know when a plain loop is clearer.

**Learn — 90 min**
- [ ] Study functional interfaces (`Predicate`, `Function`, `Consumer`, and `Supplier`), lambdas, and method references.
- [ ] Learn streams: `filter`, `map`, `sorted`, `collect`, and `reduce`.
- [ ] Explore `Collectors.groupingBy`, `partitioningBy`, `joining`, and `counting`.
- [ ] Understand `Optional` and how it can replace null checks.
- [ ] Learn modern syntax: `record`, `var`, text blocks, switch expressions, and pattern matching for `instanceof`.
- [ ] Study `java.time`: `LocalDate`, `LocalDateTime`, and `Duration`.

**Practice — 120 min**
- [ ] Complete ten stream exercises on a `List<Employee>`: highest paid, group by department, average salary, and names joined with commas.
- [ ] Convert five earlier loop solutions into streams.
- [ ] Define your own functional interface and pass a lambda to it.
- [ ] Chain `Optional` calls instead of using nested null checks.

**Build — 60 min**
- [ ] Build an employee report using a `record`; print salary statistics per department with streams.

**Review — 30 min**
- [ ] Identify one stream pipeline that is harder to read than a loop and rewrite it as a loop.
- [ ] Commit and push your work.

### Day 8 — Friday, 20 November: File I/O and concurrency

**Goal:** Save data to disk and run work on multiple threads without a race condition.

**Learn — 90 min**
- [ ] Study `Path`, `Files.readAllLines`, `Files.write`, `BufferedReader`, and try-with-resources for files.
- [ ] Learn CSV reading and writing; review JSON handling with Jackson or Gson.
- [ ] Study `Thread`, `Runnable`, the thread lifecycle, and `join`.
- [ ] Understand `synchronized`, race conditions, and `volatile`.
- [ ] Learn the basics of `ExecutorService`, `Callable`, `Future`, and `CompletableFuture`.
- [ ] Explore `ConcurrentHashMap`, `AtomicInteger`, and what virtual threads in Java 21 change.

**Practice — 120 min**
- [ ] Read a text file and count its lines and words.
- [ ] Write and read a CSV file containing students.
- [ ] Demonstrate a race condition with a shared counter; fix it with `synchronized`, then with `AtomicInteger`.
- [ ] Run five tasks on a fixed thread pool and collect results through `Future`.
- [ ] Implement producer and consumer using a `BlockingQueue`.

**Build — 60 min**
- [ ] Make the bank app load accounts from a CSV file at startup and save them on exit.

**Review — 30 min**
- [ ] Explain why `count++` is not atomic.
- [ ] Commit and push your work.

### Day 9 — Saturday, 21 November: Maven, JUnit, and JDBC

**Goal:** Run a Maven project with tests that communicates with a database.

**Learn — 90 min**
- [ ] Learn Maven: `pom.xml`, dependencies, the `src/main/java` and `src/test/java` layout, and `mvn compile`, `mvn test`, and `mvn package`.
- [ ] Study JUnit 5: `@Test`, assertions, `@BeforeEach`, and `assertThrows`.
- [ ] Learn JDBC: connections, `PreparedStatement`, `ResultSet`, and closing resources with try-with-resources.
- [ ] Refresh SQL: `CREATE`, `INSERT`, `SELECT`, `UPDATE`, `DELETE`, and `JOIN`. Use H2, SQLite, or PostgreSQL.
- [ ] Read the Spring Boot quickstart on dev.java or spring.io to understand what it adds on top of JDBC.

**Practice — 120 min**
- [ ] Convert the bank app into a Maven project.
- [ ] Write eight JUnit tests for `BankAccount`, including exception cases.
- [ ] Implement JDBC CRUD operations on a `students` table.
- [ ] Demonstrate SQL injection using string concatenation, then fix it with `PreparedStatement`.
- [ ] Run `mvn test` and `mvn package`; read and understand the output.

**Build — 60 min**
- [ ] Replace the CSV storage in the bank app with JDBC.

**Review — 30 min**
- [ ] Write down the three Java topics that still feel shaky; revisit them during Day 10's review.
- [ ] Commit and push your work.

### Day 10 — Sunday, 22 November: Capstone and gap check

**Goal:** Publish a working, tested application on GitHub with a README and a short list of what to study next.

**Plan — 30 min**
- [ ] Choose one capstone: a library manager, task tracker, or inventory tool.
- [ ] Write 8–10 requirements.
- [ ] Sketch the classes and how they connect.

**Build — 150 min**
- [ ] Implement at least four classes, one interface, and one custom exception.
- [ ] Use collections and at least three stream pipelines.
- [ ] Persist data using JDBC or a file.
- [ ] Write at least ten JUnit tests and get `mvn test` passing.
- [ ] Add a simple menu-driven console interface.

**Practice — 60 min**
- [ ] Answer 15 Core Java questions aloud. Cover JVM memory areas, `equals`/`hashCode`, `HashMap` internals, the string pool, checked vs. unchecked exceptions, `final` vs. `finally`, abstract classes vs. interfaces, and thread safety.
- [ ] Solve three LeetCode Easy problems in Java.

**Review — 60 min**
- [ ] Write the capstone README: what the application does, how to run it, and how to test it.
- [ ] Push the capstone to GitHub.
- [ ] Write your gap list and choose your next focus: Spring Boot, DSA in Java, or design patterns.

---

## Free learning resources

| Resource | Use it for |
|---|---|
| [dev.java/learn](https://dev.java/learn/) | Official Java tutorials; use this as the main reference. |
| [University of Helsinki Java Programming MOOC](https://java-programming.mooc.fi/) | Deeper reading and structured learning. |
| [CodingBat — Java](https://codingbat.com/java) | Short Java practice problems. |
| [Exercism — Java track](https://exercism.org/tracks/java) | Java exercises with feedback. |

## Completion checklist

- [ ] All ten days completed.
- [ ] Daily practice and build work committed to GitHub.
- [ ] Comfortable writing basic Java programs without looking up every syntax detail.
- [ ] Able to explain and apply object-oriented programming concepts.
- [ ] Able to choose and use common Java collections.
- [ ] Able to use lambdas, streams, and `Optional` appropriately.
- [ ] Able to read and write files and explain basic concurrency concerns.
- [ ] Able to build a Maven project, write JUnit tests, and use JDBC safely with `PreparedStatement`.
- [ ] Capstone has at least four classes, one interface, one custom exception, three stream pipelines, persistence, and ten passing JUnit tests.
- [ ] Capstone is published on GitHub with instructions for running and testing it.
- [ ] A next-step study plan is written.

## After these 10 days

Use the Day 10 gap list to decide what comes next. The suggested next areas are:

- **Spring Boot** — build applications and APIs on top of your Java foundation.
- **DSA in Java** — develop problem-solving and interview preparation skills.
- **Design patterns** — learn reusable approaches to common software design problems.

---

**Keep the work practical: learn a concept, solve problems with it, build something, review it, and commit it.**
