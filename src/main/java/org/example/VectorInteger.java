package org.example;

public class VectorInteger {
    int size = 0;
    ScalarInteger values[];

    public VectorInteger(int size, int values[]){
        this.values = new ScalarInteger[size];
        for (int i=0; i< size; i++){
            this.values[i] = new ScalarInteger(values[i]);
        }


    }

    public int get(int position){
        return values[position].get();
    }
}
