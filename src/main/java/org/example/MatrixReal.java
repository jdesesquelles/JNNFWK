package org.example;

public class MatrixReal {
    int row;
    int col;
    VectorReal[] values;

    public double get(int row, int col){
        double return_value = values[row].get(col);
        return return_value;
    }

    public MatrixReal(int row, int col, double[] values){
        this.values = new VectorReal[row];
        for (int i=0; i < row; i++){
            this.values[i] = new VectorReal(col, MatrixToVectors(i, row, values));
        }

    }
    private double[] MatrixToVectors(int row, int size, double[] matrix){
        double[] return_value = new double[size];
        for (int i = 0; i < size; i++){
            return_value[i] = matrix[row*size+i];
        }
        return return_value;
    }
}
