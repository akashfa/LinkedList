public class NodeAddMind {
    Node head;
    int count = 0;

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
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        Node curr = head;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void insertAtMid(Node pre_node, int data) {
        if (pre_node == null) {
            System.out.println("Enter the valid node");
        }
        Node newNode = new Node(data);
        newNode.next = pre_node.next;
        pre_node.next = newNode;

    }

    public void PrintList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        NodeAddMind lm = new NodeAddMind();
        lm.InsertAtStart(2);
        lm.InsertAtStart(4);
        lm.InsertAtStart(6);
        lm.InsertAtStart(8);
        lm.InsertAtStart(10);
        lm.InsertAtStart(12);
        lm.PrintList();
        System.out.println();
        System.out.println("Insert node any position:");
        lm.insertAtMid(lm.head.next.next, 13);
        lm.PrintList();

    }
}
