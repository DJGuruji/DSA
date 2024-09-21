import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListCycle {
    public static boolean hasCycle(LinkedList<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        
        // Create a ListIterator to go through the LinkedList
        for (Integer node : list) {
            // If the node has been seen before, we have a cycle
            if (seen.contains(node)) {
                return true;
            }
            seen.add(node);  // Add the node to the set of seen nodes
        }
        
        return false;  // No cycle found
    }
    
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(-4);
        
        // Simulate a loop by adding repeated nodes
        list.add(2);  // Repeat node to simulate a cycle
        
        // Check for cycle
        boolean hasCycle = hasCycle(list);
        System.out.println("Has Cycle: " + hasCycle);  // Output: true
    }
}
