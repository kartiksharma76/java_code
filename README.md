<div align="center">

# ☕ Java 17 Learning & Practice Workspace

### **A Comprehensive Java 17 Learning Repository**

*Master Core Java • OOP • DSA • Multithreading • JDBC • Java 8 • File Handling • Mini Projects*

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk)
![JDK](https://img.shields.io/badge/JDK-17-LTS-red?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql)
![Eclipse](https://img.shields.io/badge/Eclipse-IDE-2C2255?style=for-the-badge&logo=eclipseide)
![JDBC](https://img.shields.io/badge/JDBC-Connectivity-green?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

---

### 🚀 Learn • Practice • Build • Master Java

</div>

---

# 📖 About

**Java17 Learning & Practice Workspace** is a complete Java programming repository designed to help students, beginners, and aspiring software engineers master Java through hands-on coding.

The repository contains hundreds of Java programs covering everything from **Core Java fundamentals** to **Advanced Multithreading**, **Data Structures & Algorithms**, **JDBC**, **Java 8 Features**, **Collections Framework**, and **Mini Projects**.

Whether you're preparing for **college exams**, **technical interviews**, **coding platforms**, or **Java developer roles**, this repository provides a structured learning path.

---

# ✨ Highlights

- ☕ Java 17 (LTS)
- 🧠 Object-Oriented Programming
- 📚 Data Structures & Algorithms
- ⚡ Java Collection Framework
- 🚀 Java 8 Stream API
- 🔥 Lambda Expressions
- 🧵 Multithreading & Concurrency
- 💾 JDBC & MySQL
- 📂 File Handling (IO & NIO)
- 🏗 Mini Projects
- 🎯 Interview Preparation
- 📖 NPTEL & RGPV Practice
- 💡 HackerRank Solutions

---

# 📂 Repository Structure

```text
Java17/
│
├── src/
│
├── operation/
│
├── .classpath
├── .project
└── README.md
```

---

# 📚 Learning Modules

---

## ☕ Core Java Fundamentals

Master the building blocks of Java.

### Topics Covered

- Variables
- Data Types
- Operators
- Control Statements
- Loops
- Methods
- Arrays
- Type Casting
- Packages
- Memory Management
- JVM Basics
- Execution Flow
- Static & Instance Blocks

---

## 🏗 Object-Oriented Programming (OOP)

Learn Java's powerful OOP concepts.

### Topics

- Classes
- Objects
- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Method Overloading
- Method Overriding
- this Keyword
- super Keyword
- Package Management

---

## 📊 Data Structures & Algorithms

Practice essential DSA concepts.

### Arrays

- Searching
- Sorting
- Rotation
- Prefix Sum
- Sliding Window

---

### Linked List

- Singly Linked List
- Doubly Linked List
- Circular Linked List
- Reverse Linked List
- Cycle Detection

---

### Stack

- Push
- Pop
- Peek
- Infix to Postfix
- Next Greater Element
- Balanced Parentheses

---

### Queue

- Linear Queue
- Circular Queue
- Priority Queue
- Deque

---

### Trees

- Binary Tree
- Binary Search Tree
- Tree Traversals
- Height Calculation

---

### Heap

- Max Heap
- Min Heap
- Heap Sort
- Priority Queue

---

### Algorithms

- Recursion
- Backtracking
- Merge Sort
- Quick Sort
- Dynamic Programming
- Mathematical Algorithms

---

# 📦 Java Collections Framework

Comprehensive practice on Java Collections.

### Collections Covered

- ArrayList
- LinkedList
- HashSet
- TreeSet
- HashMap
- LinkedHashMap
- TreeMap
- PriorityQueue

Also includes

- Comparable
- Comparator
- Generic Collections
- Collection Utilities

---

# 🧬 Java Generics

Topics include

- Generic Classes
- Generic Methods
- Wildcards
- Bounded Types
- Type Parameters

---

# ⚡ Java 8 Features

Modern Java programming techniques.

### Functional Programming

- Lambda Expressions
- Functional Interfaces
- Method References
- Default Methods

---

### Stream API

Practice

- filter()
- map()
- reduce()
- collect()
- sorted()
- groupingBy()
- max()
- min()
- flatMap()

---

### Functional Interfaces

- Predicate
- Function
- Consumer
- Supplier
- BiFunction
- BinaryOperator

---

# 🧵 Multithreading & Concurrency

Advanced Java threading concepts.

### Topics

- Thread Class
- Runnable Interface
- Synchronization
- Deadlock
- Locks
- ReentrantLock
- ReadWriteLock
- ExecutorService
- Thread Pools
- Callable
- Future
- Concurrent Programming

---

# 📁 File Handling

Classic and Modern File APIs.

### IO

- FileInputStream
- FileOutputStream
- BufferedReader
- BufferedWriter
- Serialization

---

### NIO

- Path
- Files
- Channels
- Buffers

---

# 🗄 JDBC & Database

Complete CRUD operations using MySQL.

### Operations

- Insert
- Update
- Delete
- Fetch

### Database

- MySQL
- JDBC Driver
- SQL Queries
- PreparedStatement
- ResultSet

---

# 🎓 Practice Collections

Repository also includes solutions for

- 🏆 HackerRank
- 📚 NPTEL Assignments
- 🎯 RGPV Lab Programs
- ❄ Winter Vacation Practice
- 🚗 Parking Management Project

---

# 🛠 Technology Stack

| Category | Technology |
|-----------|------------|
| Language | Java 17 |
| IDE | Eclipse IDE |
| Database | MySQL |
| Connectivity | JDBC |
| Build | JDK 17 |
| Version Control | Git |

---

# 📂 Project Structure

```text
Java17
│
├── src
│   ├── javabasics
│   ├── datatype
│   ├── operators
│   ├── controlflow
│   ├── encapsulation
│   ├── inheritance
│   ├── polymorphism
│   ├── arrays
│   ├── linkedlist
│   ├── stack
│   ├── queue
│   ├── tree
│   ├── heap
│   ├── recursion
│   ├── collections
│   ├── generics
│   ├── streamapi
│   ├── multithreading
│   ├── synchronization
│   ├── jdbc
│   ├── io
│   ├── nio
│   ├── parkingmanagement
│   ├── hackerrank
│   ├── rgpv
│   └── nptel
│
├── operation
│   ├── InsertOperation.java
│   ├── FetchOperation.java
│   ├── UpdateOperation.java
│   └── DeleteOperation.java
│
├── .classpath
├── .project
└── README.md
```

---

# 💾 Database Setup

Create the database.

```sql
CREATE DATABASE test;

USE test;

CREATE TABLE student(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    roll_number VARCHAR(20),
    city VARCHAR(50)
);
```

Update your JDBC configuration.

```properties
URL=jdbc:mysql://localhost:3306/test
Username=root
Password=your_password
```

---

# 🚀 Getting Started

## Clone Repository

```bash
git clone https://github.com/yourusername/Java17.git
```

---

## Import into Eclipse

1. Open Eclipse IDE
2. File → Import
3. Existing Projects into Workspace
4. Select Java17 Folder
5. Click Finish

---

## Compile Java Program

```bash
javac -d bin src/controlflow/BasicMaths14.java
```

---

## Run Program

```bash
java -cp bin controlflow.BasicMaths14
```

---

## JDBC Compilation

```bash
javac -d bin -cp "libs/mysql-connector-j.jar" operation/*.java
```

Run

```bash
java -cp "bin;libs/mysql-connector-j.jar" operation.FetchOperation
```

---

# 🎯 Learning Outcomes

After completing this repository, you'll understand

- ✅ Core Java
- ✅ OOP
- ✅ Collections Framework
- ✅ Generics
- ✅ DSA
- ✅ Java 8 Features
- ✅ Stream API
- ✅ Multithreading
- ✅ Synchronization
- ✅ JDBC
- ✅ MySQL
- ✅ File Handling
- ✅ Interview Coding Questions

---

# 🤝 Contributing

Contributions are always welcome.

1. Fork this repository.
2. Create a new branch.
3. Commit your changes.
4. Push to GitHub.
5. Open a Pull Request.

---

# 📜 License

This project is licensed under the **MIT License**.

---

<div align="center">

## ⭐ Show Your Support

If this repository helped you learn Java, consider giving it a ⭐ on GitHub.

It motivates future development and helps others discover the project.

---

# ☕ Java 17 Learning & Practice Workspace

### **Learn Java. Practice Daily. Build Real Projects.**

Made with ❤️ using **Java 17 • Eclipse IDE • JDBC • MySQL**

</div>


# DSA Master Sheet — Java Solutions 🚀

![Java](https://img.shields.io/badge/Language-Java-orange)
![Progress](https://img.shields.io/badge/Problems-502-blue)
![Phases](https://img.shields.io/badge/Phases-9-green)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)

A structured, phase-wise Data Structures & Algorithms practice roadmap, implemented **entirely in Java**. Problems are organized by phase → topic → subtopic, mirroring a typical interview-prep progression from fundamentals to advanced algorithms.

---

## 📂 Repository Structure

```
dsa-java/
└── src/
    └── main/
        └── java/
            └── dsa/
                ├── phase1_fundamentals/
                │   ├── arrays/
                │   ├── arrays2d/
                │   ├── basicmaths/
                │   └── strings/
                ├── phase2_searching/
                │   └── binarysearch/
                ├── phase3_algorithmic_thinking/
                │   ├── recursion/
                │   └── sorting/
                ├── phase4_oops/
                ├── phase5_advanced_linear_ds/
                │   ├── linkedlist/
                │   ├── stacks/
                │   └── queues/
                ├── phase6_hierarchical_ds/
                │   ├── binarytrees/
                │   ├── bst/
                │   └── tries/
                ├── phase7_core_ds_techniques/
                │   ├── hashmaps/
                │   ├── heaps/
                │   ├── prefixsum/
                │   ├── twopointers_slidingwindow/
                │   └── bitmanipulation/
                ├── phase8_standard_algorithms/
                │   ├── greedy/
                │   └── graphs/
                └── phase9_exhaustive_search/
                    ├── backtracking/
                    └── dynamicprogramming/
```

Each problem lives in its own class, named after the problem (e.g. `MinAndMaxInArray.java`), with a `main` method or JUnit test for local verification.

---

## 🗺️ Roadmap & Progress

| Phase | Topics | Problems |
|---|---|---:|
| **Phase 1** — Fundamentals & Linear Data Structures | Arrays, 2D Arrays, Basic Maths, Strings | 64 |
| **Phase 2** — Searching Algorithms | Binary Search | 37 |
| **Phase 3** — Algorithmic Thinking | Recursion, Sorting | 19 |
| **Phase 4** — Object-Oriented Concepts | OOPS (Classes, Inheritance, Design Patterns) | 6 |
| **Phase 5** — Advanced Linear Data Structures | Linked List, Stacks, Queues | 81 |
| **Phase 6** — Hierarchical Data Structures | Binary Trees, BST, Tries | 57 |
| **Phase 7** — Core Data Structures & Techniques | Hashmaps, Heaps, Prefix Sum, Two Pointers/Sliding Window, Bit Manipulation | 84 |
| **Phase 8** — Standard Algorithms | Greedy, Graphs | 77 |
| **Phase 9** — Exhaustive Search & Optimisation | Backtracking, Dynamic Programming | 77 |
| **Total** | | **502** |

### Topic breakdown

<details>
<summary><b>Phase 1 — Fundamentals & Linear Data Structures (64)</b></summary>

- Arrays — 29
- 2D Arrays — 12
- Basic Maths — 6
- Strings — 17
</details>

<details>
<summary><b>Phase 2 — Searching Algorithms (37)</b></summary>

- Binary Search — 37 (1D basics, BS on 2D arrays, BS on answer)
</details>

<details>
<summary><b>Phase 3 — Algorithmic Thinking (19)</b></summary>

- Recursion — 10
- Sorting — 9
</details>

<details>
<summary><b>Phase 4 — Object-Oriented Concepts (6)</b></summary>

- OOPS Fundamentals & Design Patterns — 6
</details>

<details>
<summary><b>Phase 5 — Advanced Linear Data Structures (81)</b></summary>

- Linked List — 43
- Stacks — 28
- Queues — 10
</details>

<details>
<summary><b>Phase 6 — Hierarchical Data Structures (57)</b></summary>

- Binary Trees — 34
- Binary Search Trees — 16
- Tries — 7
</details>

<details>
<summary><b>Phase 7 — Core Data Structures & Techniques (84)</b></summary>

- Hashmaps — 19
- Heaps / Priority Queues — 15
- Prefix Sum — 10
- Two Pointers & Sliding Window — 25
- Bit Manipulation — 15
</details>

<details>
<summary><b>Phase 8 — Standard Algorithms (77)</b></summary>

- Greedy — 22
- Graphs — 55
</details>

<details>
<summary><b>Phase 9 — Exhaustive Search & Optimisation (77)</b></summary>

- Backtracking — 22
- Dynamic Programming — 55
</details>

---

## ⚙️ Setup & Run

Requires **JDK 17+** and **Maven** (or plain `javac`).

**Compile & run a single solution:**
```bash
javac src/main/java/dsa/phase1_fundamentals/arrays/MinAndMaxInArray.java -d out
java -cp out dsa.phase1_fundamentals.arrays.MinAndMaxInArray
```

**With Maven:**
```bash
mvn compile
mvn exec:java -Dexec.mainClass="dsa.phase1_fundamentals.arrays.MinAndMaxInArray"
```

**Run tests (if using JUnit):**
```bash
mvn test
```

---

## ✅ Conventions

- One class per problem, named in `PascalCase` matching the problem title.
- Each file starts with a short Javadoc block: problem statement, approach, and time/space complexity.
- Difficulty is tagged 1–5 (★☆☆☆☆ → ★★★★★) per the master sheet.
- Status per problem: `Not Attempted`, `Tried`, `Logic Done`, `Code Done`, `Done`.

```java
/**
 * Problem: Min and Max in Array
 * Approach: Single pass, track running min/max.
 * Time: O(n) | Space: O(1)
 */
public class MinAndMaxInArray {
    public static void main(String[] args) {
        // ...
    }
}
```

---

## 📌 Notes

- This README is generated from `DSA_Master_Sheet.xlsx` (sheet: *DSA Sheet Final*).
- Update the progress table as topics/problems are added or completed.
