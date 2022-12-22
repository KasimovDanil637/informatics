package itis;


public class StackImpl implements IStack {

    private Object[] data;

    private int count = 0;

    private int len = 10;

    public StackImpl() {
        data = new Object[len];
    }

    public Object pop() {
        Object tmp = data[count - 1];
        data[count - 1] = null;
        count--;
        return tmp;
    }

    public void push(Object o) {
        if (count + 1 > len ) {
            Object[] tmp = new Object[count+1];
            System.arraycopy(data, 0, tmp, 0, count);
            data = tmp;
        }
        data[count++] = o;
    }
}