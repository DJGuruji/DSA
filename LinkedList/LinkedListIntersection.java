
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListIntersection {

    // Method to find intersection based on values (content-based)
    public static LinkedList<Integer> getIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> intersection = new LinkedList<>();

        // Add all elements of list1 to the set
        for (Integer val : list1) {
            set.add(val);
        }

        // Check if any element of list2 is in the set
        for (Integer val : list2) {
            if (set.contains(val)) {
                intersection.add(val);
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        // Sample input lists
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(4);
        list1.add(2);
        list1.add(4);
        list1.add(7);
        list1.add(8);
        list1.add(6);
        list1.add(9);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(6);
        list2.add(3);
        list2.add(2);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        // Find the intersection
        LinkedList<Integer> intersection = getIntersection(list1, list2);

        // Print the intersection list
        System.out.println("Intersection: " + intersection);
    }
}
