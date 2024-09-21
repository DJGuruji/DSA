

//print K th to last


import java.util.LinkedList;

public class PrintKthToLast {

    // Method to print elements from K-th to the last in the LinkedList
    public static void printKthToLast(LinkedList<Integer> list, int k) {
        if (k > list.size() || k <= 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        // Start printing from the (k-1)th index (since LinkedList is 0-indexed)
        for (int i = k - 1; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Print elements from K-th to the last element, where k=3
        int k = 3;
        System.out.println("Elements from " + k + "-th to the last:");
        printKthToLast(list, k);
    }
}