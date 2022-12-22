package itis.informatic;
import java.util.Arrays;
public class Main {
    public static void main(String... args) {
        Matrix2 matrix1 = new Matrix2(new double[][]{{3,3},{2,5}});
        Matrix2 matrix2 = new Matrix2(new double[][]{{5,2},{1,3}});
        System.out.println("Сложение" + "\n" + matrix1.plus(matrix2));
        System.out.println("Вычитание" + "\n" + matrix1.minus(matrix2));
        System.out.println("Определитель" + "\n" + matrix1.det() + "\n" );
        System.out.println("Произведение матриц" + "\n" + matrix1.pM(matrix2));
        System.out.println("Транспонирование матрицы" + "\n" + matrix1.T());
        System.out.println("Произведение матрицы на число" + "\n" + matrix1.pA(3));
        Matrix4 matrix3 = new Matrix4(1,2,3,4);
        Matrix4 matrix4 = new Matrix4(2,3,6,7);
        System.out.println("----------------------------------------");
        System.out.println("Сложение" + "\n" + Arrays.deepToString(matrix3.plus(matrix4)) + "\n");
        System.out.println("Вычитание" + "\n" + Arrays.deepToString(matrix3.minus(matrix4)) + "\n");
        System.out.println("Произведение на число" + "\n" +  Arrays.deepToString(matrix3.pA(3)) + "\n");
        System.out.println("Транспонирование" + "\n" +  Arrays.deepToString(matrix3.T()) + "\n");
        System.out.println("Определитель" + "\n" +  (matrix3.det()) + "\n");
        System.out.println("Произведение матриц" + "\n" +  Arrays.deepToString(matrix3.pM(matrix4)) + "\n");
        System.out.println("----------------------------------------");
        MatrixN matrix5 = new MatrixN(new double[][]{{3,2,3},{6,7,8},{5,6,7}},3,3);
        System.out.println(matrix5);
    }
}
