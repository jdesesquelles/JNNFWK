package org.example;

public class VectorReal {
    int size = 0;
    ScalarReal values[];

    public VectorReal(int size, double values[]){
        this.values = new ScalarReal[size];
        for (int i=0; i< size; i++){
            this.values[i] = new ScalarReal(values[i]);
        }


    }

    public double get(int position){
        return values[position].get();
    }
}
