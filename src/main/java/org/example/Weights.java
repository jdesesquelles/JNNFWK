package org.example;

import java.util.Vector;

public class Weights {
    //public Vector<Double> weights;
    private VectorReal weigths;

    public Weights(int vectorSize, double[] values){
     this.weigths = new VectorReal(vectorSize, values);

    }
    public Weights(int vectorSize){
        double init_value = 0.0;
        double[] values = new double[vectorSize];
        for (int i = 0; i < vectorSize; i++){
            values[i] = init_value;
        }
        this.weigths = new VectorReal(vectorSize, values);
    }
    public Weights(int vectorSize, int init_value){
        double[] values = new double[vectorSize];
        for (int i = 0; i < vectorSize; i++){
            values[i] = init_value;
        }
        this.weigths = new VectorReal(vectorSize, values);
    }

    public double get(int position){
        return weigths.get(position);
    }
}
