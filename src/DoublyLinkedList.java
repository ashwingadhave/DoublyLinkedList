public class DoublyLinkedList <T>{
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    private class Node<T>{
        T data;
        Node <T> prev,next;

        public Node(T data, Node<T> prev, Node<T> next){
            this.data = data;
            this.prev = prev;
            this.next =next;
        }
    }

    public void addNodeAtLast(T data){
        if(head == null){
            head = tail = new Node<T>(data,null,null);

        }else if(head == tail){
            head.next = new Node<T>(data,head,null);
            tail = head.next;
        }else{
            tail.next = new Node<T>(data, tail, null);
            tail = tail.next;
        }

    }

    public void removeNode(Node<T> node){
        if(head == null){
            throw new RuntimeException();
        }else{
            Node<T> temp = head;
            while(temp.next != node){
                temp =temp.next;
            }
            temp.next = node.next;
        }
    }

}
