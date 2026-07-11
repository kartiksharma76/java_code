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
