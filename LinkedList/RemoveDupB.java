// remove duplicates Using Built In LinkedList if no additional datastructers can be used


import java.util.LinkedList;

public class RemoveDupB {

    // Method to remove duplicates without using extra data structures
    public static void removeDuplicates(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            // Start checking for duplicates from the next element
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == current) {
                    list.remove(j);
                    j--; // Adjust the index after removal
                }
            }
        }
    }

    // Method to print the LinkedList
    public static void printList(LinkedList<Integer> list) {
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Insert elements into the LinkedList
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Original list:");
        printList(list);

        // Remove duplicates
        removeDuplicates(list);

        System.out.println("List after removing duplicates:");
        printList(list);
    }
}




    // Method to remove duplicates from the LinkedList if using Hashset
    // public static void removeDuplicates(LinkedList<Integer> list) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for (int i = 0; i < list.size(); i++) {
    //         int value = list.get(i);
    //         // If the set already contains the value, remove it from the list
    //         if (!set.add(value)) {
    //             list.remove(i);
    //             i--; // Adjust the index after removal
    //         }
    //     }
    // }