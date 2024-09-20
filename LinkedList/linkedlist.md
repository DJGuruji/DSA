HashSet, LinkedHashSet, TreeSet


n Java, the Set interface is a collection that contains no duplicate elements. Java provides several implementations of the Set interface, each with its own characteristics and use-cases. The three primary implementations are:

1. HashSet


2. LinkedHashSet


3. TreeSet



Understanding the differences between these sets is crucial for selecting the right one based on your specific requirements. Below is a detailed comparison along with examples for each.


---

1. HashSet

Characteristics:

Underlying Data Structure: Hash table (backed by a HashMap instance).

Ordering: No guarantees on the iteration order; it does not maintain any order.

Performance:

Add, Remove, Contains: Constant time performance (O(1)) on average.


Allows null Elements: Yes, but only one null element since sets do not allow duplicates.


When to Use:

When you need a collection with no duplicates and don't care about the order of elements.

When you require the best performance for basic operations.


Example:

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate, will not be added

        System.out.println("HashSet contents:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}

Possible Output:

HashSet contents:
Banana
Apple
Cherry

Note: The order may vary.


---

2. LinkedHashSet

Characteristics:

Underlying Data Structure: Hash table combined with a doubly-linked list (maintains insertion order).

Ordering: Maintains the order in which elements were inserted.

Performance:

Add, Remove, Contains: Slightly slower than HashSet due to the maintenance of the linked list, but still offers constant time performance on average.


Allows null Elements: Yes, similar to HashSet.


When to Use:

When you need a collection with no duplicates and want to maintain the insertion order.

When you require predictable iteration order.


Example:

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Duplicate, will not be added

        System.out.println("LinkedHashSet contents:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}

Output:

LinkedHashSet contents:
Apple
Banana
Cherry

The insertion order is preserved.


---

3. TreeSet

Characteristics:

Underlying Data Structure: Red-Black tree (a type of self-balancing binary search tree).

Ordering: Maintains elements in their natural order (sorted order) or according to a provided Comparator.

Performance:

Add, Remove, Contains: Logarithmic time performance (O(log n)).


Allows null Elements: No, attempting to add null will throw a NullPointerException.

Additional Features: Provides methods to navigate the sorted set, such as first(), last(), headSet(), tailSet(), etc.


When to Use:

When you need a collection with no duplicates and require the elements to be sorted.

When you need to perform range-based operations.


Example:

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        // treeSet.add(null); // This would throw NullPointerException

        System.out.println("TreeSet contents:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Using a custom comparator for reverse order
        Set<String> reverseTreeSet = new TreeSet<>((a, b) -> b.compareTo(a));
        reverseTreeSet.addAll(treeSet);

        System.out.println("\nTreeSet in reverse order:");
        for (String fruit : reverseTreeSet) {
            System.out.println(fruit);
        }
    }
}

Output:

TreeSet contents:
Apple
Banana
Cherry

TreeSet in reverse order:
Cherry
Banana
Apple

Elements are sorted in natural (alphabetical) order and reverse order based on the custom comparator.


---

Summary of Differences


---

Choosing the Right Set Implementation

Use HashSet when you need the best performance and don't care about the order of elements.

Use LinkedHashSet when you need to maintain the insertion order of elements.

Use TreeSet when you need the elements to be sorted, either naturally or via a custom comparator.


By understanding these differences, you can select the most appropriate Set implementation for your specific needs in Java applications.