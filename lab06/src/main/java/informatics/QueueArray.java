package informatics;

public class QueueArray implements IQueue {
    private Object[] data;

    private int count = 0;

    private int len = 10;
    private int n;
    private int q;
    public QueueArray() {
        data = new Object[len];
    }
    public Object pop() {
        Object tmp = data[count-n];
        data[count - n] = null;
        n--;
        return tmp;
    }
    public void push(Object o) {
        if (count + 1 > len ) {
            len += len/2;
            Object[] tmp = new Object[len];
            System.arraycopy(data, 0, tmp, 0, count);
            data = tmp;
        }
        data[count++] = o;
        n = count;
    }
}
