package itis;

public class main {
    public static void main(String[] args) {
        int n = 100000;
        IStack stack = new StackImpl() ;
        Long start = System.nanoTime();
        for (int i = 1; i < n + 1; i++) {
            stack.push(i);
        }
        for (int i = 1; i < n + 1; i++){
            stack.pop();
        }
        Long finish  = System.nanoTime();
        Long time = finish - start;
        System.out.println(time);

    }
}
//10^6 massive average ~ 391 818 683 458        Node average ~ 2 049 187 610 666
//10^5 massive average ~ 1 076 300 584          Node average ~ 16 933 896 458
//10^3 massive average ~ 6 500 000              Node average ~ 8 400 000
