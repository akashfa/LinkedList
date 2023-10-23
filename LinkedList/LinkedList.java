public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // head = newNode;
            head = new Node(data);
            return;
        }
        newNode.next = null;
        Node Current = head;

        while (Current.next != null) {
            Current = Current.next;
        }
        Current.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.InsertAtEnd(2);
        link.InsertAtEnd(3);
        link.InsertAtEnd(4);
        link.InsertAtEnd(6);
        System.out.println("Before intsert 8: ");
        link.display();
        link.InsertAtEnd(8);
        System.out.println();
        System.out.println("After intsert 8: ");
        link.display();
    }
}