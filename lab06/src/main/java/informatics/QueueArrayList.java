package informatics;


public class QueueArrayList implements IQueue {

    private Node root;


    @Override
    public void push(Object o) {
        Node element = new Node(o);
        if (root == null) {
            root = element;
        } else {
            Node lastElement = root;
            while (lastElement.next != null) {
                lastElement = lastElement.next;
            }
            lastElement.next = element;
        }
    }
    @Override
    public Object pop() {
        Node tmp = root;
        if (root != null) {
            root = root.next;
            return tmp.object;
        }
        return null;
    }

    class Node {
        private Object object;
        private Node next;
        Node(Object o) {
            object = o;
        }
    }
}
