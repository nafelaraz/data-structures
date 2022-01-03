package linkedlists;

public class LinkedList {


    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }

    }

    public void prepend(int data) {
        Node current = new Node(data);
        current.next = head;
        head = current;
    }

    public void deleteWithValue(int data){
        if(head == null){
            return;
        }
        if(data == head.data){
            head = head.next;
        }else{
            Node current = head;
            while(current.next != null){
                if(current.next.data == data){
                    current.next = current.next.next;
                    return;
                }
                current = current.next;

            }
        }
    }
}
