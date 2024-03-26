
/**
 * The purpose of this class is to perform a card shuffle of a Singly Linked Positional List.
 * The main method runs some tests.
 *
 */


class CardShuffle{

    Node head;
    static class Node{ // Node class
        int data;
        Node next;

        Node(int d){ // Creating new node
            data = d;
            next = null;
        }
    }

    /**
     * This method prints the data of each node in the linked list
     *
     * @param node The head node of the linked list
     */
    void printCards(Node node)
    {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(", ");
            }
            node = node.next;
        }
    }

    /**
     * This method performs a shuffle of the cards represented by a linked list.
     */
    void cardShuffle(){
        if(head == null) {
            return;
        }

        Node slow = head;
        Node fast = slow.next;

        while(fast != null && fast.next != null){ // Using tortoise and hare method to find middle point
            slow = slow.next;
            fast = fast.next.next;
        }

        Node L1 = head; // Splitting list into two halves L1 and L2
        Node L2 = slow.next;
        slow.next = null;

        head = new Node(0); // Dummy Node

        Node point = head; // Pointer to Dummy

        while(L1 != null || L2 != null){
            if(L1 != null){ // Add element from L1
                point.next = L1;
                point = point.next;
                L1 = L1.next;
            }
            if(L2 != null){ // Add element from L2
                point.next = L2;
                point = point.next;
                L2 = L2.next;
            }
        }
        head = head.next;
    }

    /**
     * Running some tests
     * @param args Command-line arguments.
     */
    public static void main(String[] args)
    {
        CardShuffle list = new CardShuffle();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
        list.head.next.next.next.next.next.next.next.next = new Node(9);

        list.cardShuffle();
        list.printCards(list.head);
    }
}