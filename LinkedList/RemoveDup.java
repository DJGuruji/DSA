class LinkedList {
    Node head;
   
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to remove duplicates
    void removeDuplicates() {
        Node current = head;

        // Traverse the list
        while (current != null) {
            Node runner = current;
            // Compare current node with the rest of the nodes
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    // Remove the duplicate
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // Method to insert new nodes
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(10);
        list.insert(30);
        list.insert(20);

        System.out.println("Original list:");
        list.printList();

        // Remove duplicates
        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.printList();
    }
}