public class ReverseList1 {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void InsertAtStart(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void reverseLinkList() {
        Node curr = head;
        Node next = null;
        Node pre = null;
        while (curr.next != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
        return;
    }

    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ReverseList1 reverse1 = new ReverseList1();
        reverse1.InsertAtStart(1);

        reverse1.InsertAtStart(2);
        reverse1.InsertAtStart(3);

        reverse1.InsertAtStart(4);

        reverse1.InsertAtStart(5);

        reverse1.InsertAtStart(6);

        reverse1.InsertAtStart(7);
        reverse1.display();
        reverse1.reverseLinkList();
        reverse1.display();
    }
}
