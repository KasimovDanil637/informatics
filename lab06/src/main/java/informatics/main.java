package informatics;
public class main {
    public static void main(String[] args) {
        IQueue queue = new QueueArray() ;
        int n = 5;
        Long start = System.nanoTime();
        for (int i = 1; i < n + 1; i++) {
            queue.push(i);
        }

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.push(6);
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
//10^3 array 5 839 708             node 8 675 958
//10^5 array 126 515 625           node 8 372 583 042
//10^6 array 1 186 791 500         node 983 941 272 667
