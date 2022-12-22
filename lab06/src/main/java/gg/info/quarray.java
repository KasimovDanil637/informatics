package gg.info;


public class quarray implements iqu {

    private Object[] data;

    private int count = 0;

    private int len = 10;

    public quarray() {
        data = new Object[len];
    }

    public Object pop() {
       while (count != 0){
           Object tmp = data[(data.length-1) - count];
           data[(data.length-1) - count] = null;
           count--;
           return tmp;
       }
       return null;
    }


    public void push(Object o) {
        if (count + 1 > len) {

            Object[] tmp = new Object[count+2];
            System.arraycopy(data, 0, tmp, 0, count);
            data = tmp;
        }
        data[count++] = o;
    }
}