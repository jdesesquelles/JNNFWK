package org.example;

public class MatrixInteger {
    int row;
    int col;
    VectorInteger[] values;

    public double get(int row, int col){
        double return_value = values[row].get(col);
        return return_value;
    }

    public MatrixInteger(int row, int col, int[] values){
        this.values = new VectorInteger[row];
        for (int i=0; i < row; i++){
            this.values[i] = new VectorInteger(col, MatrixToVectors(i, row, values));
        }

    }
    private int[] MatrixToVectors(int row, int size, int[] matrix){
        int[] return_value = new int[size];
        for (int i = 0; i < size; i++){
            return_value[i] = matrix[row*size+i];
        }
        return return_value;
    }
}
