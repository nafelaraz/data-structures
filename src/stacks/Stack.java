package stacks;

public class Stack {

    Node top;

    public boolean isEmpty(){
        return top==null;
    }

    public int peek(){
        return top.data;
    }

    public void push(int data){
        Node node = new Node(data);
        if(top == null){
            node = top;
            return;
        }
        node.next = top;
        top = node;
    }

    public int pop(){

        int data = top.data;
        top = top.next;

        return data;
    }

}
