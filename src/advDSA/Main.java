package advDSA; // Ensure this matches your folder structure

public class Main {
    public static void main(String[] args) {
        // Creating nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes to form a simple linked list
        first.next = second;
        second.next = third;

        // Printing the linked list
       printList(first);
        int K = getKthelement(first, 3); System.out.println(K);
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int getKthelement(Node head, int k){
        Node temp = head;
        temp = head;
        for(int i = 1; i <  k; i++){
            temp = temp.next;
        }
        if (temp == null) {
            throw new IllegalArgumentException("The linked list is shorter than " + k + " elements.");
           // return 1;
        }
        return temp.data;
    }
       
}