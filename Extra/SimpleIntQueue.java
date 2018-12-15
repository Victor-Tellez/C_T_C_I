public class SimpleIntQueue {
    public static class Node{
        public int value;
        public Node next;
        public Node(int val) {
            this.value = val;
        }
    }

    public static void enqueue(Node head, int val){
        Node pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        Node x = new Node(val);
        pointer.next = x;
    }

    public static Node dequeue(Node head){
        Node pointer = head;
        if(head.next == null){
            return head;
        }
        int holder = head.next.value;
        head.next = head.next.next;
        head.value = holder;
        return pointer;
    }

    public static void printQueue(Node head){
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.value+" ");
            pointer = pointer.next;
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        System.out.println("dobra the dog");
        Node n1 = new Node(1);
        enqueue(n1,2);
        enqueue(n1,3);
        enqueue(n1,4);
        enqueue(n1,5);
        printQueue(n1);
        dequeue(n1);
        printQueue(n1);
        dequeue(n1);

    }
}

