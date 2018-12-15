public class SimpleIntStack {
    public static class Node{
        public int value;
        public Node next;
        public Node(int val) {
            this.value = val;
        }
    }

    public static void push(Node head, int val){
        Node tail = new Node(val);
        Node pointer = head;

        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = tail;
    }

    public static Node pop(Node head){
        Node pointer1 = head;
        Node pointer2 = null;
        if(head.next == null){
            return head;
        }
        while(pointer1.next != null){
            pointer2 = pointer1;
            pointer1 = pointer1.next;
        }
        pointer2.next = null;
        return pointer1;
    }

    public static void printStack(Node head){
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.value+" ");
            pointer = pointer.next;
        }
        System.out.println(" ");
    }



    public static void main(String args[]) {
        System.out.println("dobra the dog");
        Node n1 = new Node(1);

        push(n1,2);
        push(n1,3);
        push(n1,4);
        push(n1,5);
        printStack(n1);
        System.out.println(pop(n1).value);
        printStack(n1);
        System.out.println(pop(n1).value);
        printStack(n1);
        System.out.println(pop(n1).value);
        printStack(n1);
        System.out.println(pop(n1).value);
        printStack(n1);
        System.out.println(pop(n1).value);
        System.out.println("dobra the dog");
    }

}
