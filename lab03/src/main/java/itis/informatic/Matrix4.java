package itis.informatic;

public class Matrix4 {
    public double a;
    public double b;
    public double c;
    public double d;
    double[][] mat = new double[2][2];
    public Matrix4(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        mat[0][0] = this.a;
        mat[0][1] = this.b;
        mat[1][0] = this.c;
        mat[1][1] = this.d;
    }
    public double getValue(int i, int j) {
        return mat[i][j];
    }

    public double[][] plus(Matrix4 matrixx) {
        double[][] c_array = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                c_array[i][j] = mat[i][j] + matrixx.getValue(i,j);
        double[][] v = c_array;
        return v;
    }
    public double[][] minus(Matrix4 matrixx) {
        double[][] c_array = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                c_array[i][j] = mat[i][j] - matrixx.getValue(i,j);
        double[][] v = c_array;
        return v;
    }
    public double[][] pA(double a) {
        double[][] c_array = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                c_array[i][j] = mat[i][j] * a;
        double[][] v = c_array;
        return v;
    }
    public double[][] T() {
        double[][] c_array = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                c_array[i][j] = mat[j][i];
        double[][] v = c_array;
        return v;
    }
    public double det(){
        double Det;
        Det = mat[0][0] * mat[1][1] - mat[1][0] * mat[0][1];
        return Det;
    }
    public double[][] pM(Matrix4 matrixx) {
        double[][] c_array = new double[2][2];
        c_array[0][0] = mat[0][0] * matrixx.getValue(0, 0) + mat[0][1] * matrixx.getValue(1, 0);
        c_array[0][1] = mat[0][0] * matrixx.getValue(0, 1) + mat[0][1] * matrixx.getValue(1, 1);
        c_array[1][0] = mat[1][0] * matrixx.getValue(0, 0) + mat[1][1] * matrixx.getValue(1, 0);
        c_array[1][1] = mat[1][0] * matrixx.getValue(0, 1) + mat[1][1] * matrixx.getValue(1, 1);
        double[][] r = c_array;
        return r;
    }
        public String toString() {
        return  mat[0][0] + ","+ mat[0][1] + "\n"
                + mat[1][0] + ","+ mat[1][1] + "\n";
    }
}
