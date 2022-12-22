package gg.info;

public class main {
    public static void main(String[] args) {
        iqu queue = new qunode() ;
        int n = 5;
        Long start = System.nanoTime();
        for (int i = 1; i < n + 1; i++) {
            queue.push(i);
        }
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.push(4);
        queue.push(7);
        queue.push(8);

        for (int i = 1; i < n + 1; i++){
            System.out.println(queue.pop());
        }
        Long finish  = System.nanoTime();
        Long time = finish - start;
        System.out.println(time);
    }
}