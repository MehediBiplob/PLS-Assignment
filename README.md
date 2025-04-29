# Memory Allocation Categories – Java vs JavaScript

This project contains simple programs demonstrating **four major memory allocation categories** using **Java** and **JavaScript**.

## 🧠 Memory Allocation Categories

### 1. Fixed Dynamic
- **Definition**: Memory is allocated at runtime with a fixed size that cannot change afterward.
- **Example**: Arrays where size is known at the time of creation and cannot be resized.

### 2. Stack Dynamic
- **Definition**: Memory is allocated during execution in the stack. Typically, this happens when variables are local to functions/methods.
- **Behavior**: Automatically deallocated when the function call ends.

### 3. Fixed Heap Dynamic
- **Definition**: Memory is allocated in the heap at runtime, and the size is fixed once allocated.
- **Usage**: Objects or arrays allocated using heap mechanisms, but not resizable.

### 4. Heap Dynamic
- **Definition**: Memory is allocated in the heap and can dynamically grow or shrink during program execution.
- **Example**: ArrayLists in Java, or Arrays with push/pop in JavaScript.

---

## 🔍 Comparison Between Java and JavaScript

| Category         | Java Example                  | JavaScript Example            | Notes                                                                 |
|------------------|-------------------------------|--------------------------------|-----------------------------------------------------------------------|
| **Fixed Dynamic** | `int[] arr = new int[5];`     | `new Array(5)`                | Size is fixed after creation in both languages.                      |
| **Stack Dynamic** | Local arrays inside methods   | Local variables in functions  | Java uses call stack strictly; JavaScript uses function scope model. |
| **Fixed Heap**    | `new Integer[5]`              | `new Array(5)`                | Both use heap memory; size is fixed after creation.                  |
| **Heap Dynamic**  | `ArrayList<Integer>`          | Dynamic arrays (`push/pop`)   | Java requires class (ArrayList); JS handles it natively.             |

---

## 📁 Files Included

```
/java/
  FixedDynamicJava.java
  StackDynamicJava.java
  FixedHeapDynamicJava.java
  HeapDynamicJava.java

/javascript/
  fixedDynamicJS.js
  stackDynamicJS.js
  fixedHeapDynamicJS.js
  heapDynamicJS.js
```

---

## ✅ Summary

Both **Java** and **JavaScript** support various forms of memory allocation. However:

- **Java** is statically typed and distinguishes stack vs. heap explicitly.
- **JavaScript** is more flexible and loosely typed, using heap more uniformly behind the scenes.

These examples help understand how **memory behavior** differs and aligns between two popular languages.