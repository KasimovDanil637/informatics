package itis.informatic;

public class Matrix2 extends MatrixN {


    public Matrix2 (double[][] matrixx){
        super (matrixx, 2, 2);
    }
    public double det(){
        double Det;
        Det = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        return Det;
    }
    public Matrix2 pM (Matrix2 matrixx) {
        double[][] c_array = new double[2][2];
        c_array[0][0] = matrix[0][0] * matrixx.getValue(0, 0) + matrix[0][1] * matrixx.getValue(1, 0);
        c_array[0][1] = matrix[0][0] * matrixx.getValue(0, 1) + matrix[0][1] * matrixx.getValue(1, 1);
        c_array[1][0] = matrix[1][0] * matrixx.getValue(0, 0) + matrix[1][1] * matrixx.getValue(1, 0);
        c_array[1][1] = matrix[1][0] * matrixx.getValue(0, 1) + matrix[1][1] * matrixx.getValue(1, 1);
        Matrix2 r = new Matrix2(c_array);
        return r;
    }

}