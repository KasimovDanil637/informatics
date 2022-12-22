package itis.informatic;


public class MatrixN {
    public double[][] matrix;
    public int m;
    public int n;
    public MatrixN(double[][] v, int m, int n) {
        this.m = m;
        this.n = n;
        matrix = new double[this.m][this.n];
        for(int i = 0; i < this.m; ++i)
            for(int j = 0; j < this.n; ++j) {
                matrix[i][j] = v[i][j];
            }
    }
    public double getValue(int i, int j) {
        return matrix[i][j];
    }

    public MatrixN plus(MatrixN matrixx) {
        double[][] c_array = new double[m][n];
        for(int i = 0; i < m; ++i)
            for(int j = 0; j < n; ++j)
                c_array[i][j] = matrix[i][j] + matrixx.getValue(i,j);
        MatrixN v = new MatrixN(c_array, m , n);
        return v;
    }
    public MatrixN minus(MatrixN matrixx) {
        double[][] c_array = new double[m][n];
        for(int i = 0; i < m; ++i)
            for(int j = 0; j < n; ++j)
                c_array[i][j] = matrix[i][j] - matrixx.getValue(i,j);
        MatrixN v = new MatrixN(c_array, m , n);
        return v;
    }
    public MatrixN pA(double a) {
        double[][] c_array = new double[m][n];
        for(int i = 0; i < m; ++i)
            for(int j = 0; j < n; ++j)
                c_array[i][j] = matrix[i][j] * a;
        MatrixN v = new MatrixN(c_array, m , n);
        return v;
    }
    public MatrixN T() {
        double[][] c_array = new double[m][n];
        for(int i = 0; i < m; ++i)
            for(int j = 0; j < n; ++j)
                c_array[i][j] = matrix[j][i];
        MatrixN c = new MatrixN(c_array, m, n);
        return c;
    }
    public String toString() {
        if (n == 2 && m == 2){
        return  matrix[0][0] + ","+ matrix[0][1] + "\n"
                + matrix[1][0] + ","+ matrix[1][1] + "\n";
    }else{
            return  matrix[0][0] + ","+ matrix[0][1] + "," + matrix[0][2] +"\n"
                    + matrix[1][0] + ","+ matrix[1][1] + "," +matrix[1][2] + "\n"
                    + matrix[2][0] + ","+ matrix[2][1] + "," +matrix[2][2] + "\n";
        }
        }
}
// MATRIX        V
//00 01 02     00 01 02
//10 11 12     10 11 12
//20 21 22     20 21 22