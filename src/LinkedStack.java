import java.util.EmptyStackException;

public class LinkedStack implements IStack {
    private class Node{
        Object data;
        Node next;

        Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public LinkedStack(){
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return(head == null);
    }

    @Override
    public Object peek() {
        if(!isEmpty())
            return head.data;
        throw new EmptyStackException();
    }

    @Override
    public void push(Object obj) {
        head = new Node(obj, head);
    }

    @Override
    public Object pop() {
        Object obj;

        if(!isEmpty()){
            obj = head.data;
            head = head.next;
            return obj;
        }
        throw new EmptyStackException();
    }


}
