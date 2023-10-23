public class NodeAddStart {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void InsertAtEnd(int data) {
        Node newNosNode = new Node(data);
        if (head == null) {
            head = newNosNode;
            return;

        }
        newNosNode.next = null;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNosNode;
    }

    public void InsertAtStart(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    public void print() {
        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        NodeAddStart li = new NodeAddStart();
        li.InsertAtEnd(1);
        li.InsertAtEnd(2);
        li.InsertAtEnd(4);
        li.InsertAtEnd(6);
        li.InsertAtEnd(7);
        li.InsertAtEnd(8);

        li.print();
        System.out.println();
        System.out.println("Insert At Start");
        li.InsertAtStart(0);
        li.print();

    }
}
