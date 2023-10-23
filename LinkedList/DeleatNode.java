public class DeleatNode {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = null;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void deleatNode(int key) {
        Node curr = head;
        Node pre = null;
        if (curr != null && curr.data == key) {
            head = curr.next;
            return;
        }
        while (curr != null && curr.data != key) {
            pre = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return;
        }
        pre.next = curr.next.next;
    }

    public void print() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DeleatNode node = new DeleatNode();
        node.insertAtEnd(12);
        node.insertAtEnd(13);
        node.insertAtEnd(14);
        node.insertAtEnd(15);
        node.insertAtEnd(16);
        node.insertAtEnd(17);
        node.insertAtEnd(18);
        node.insertAtEnd(19);
        node.insertAtEnd(20);
        node.print();
        node.deleatNode(12);
        node.print();
    }
}
