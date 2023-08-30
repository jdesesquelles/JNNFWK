package org.example;

public class Inputs {
    private VectorInteger inputs;

    public Inputs(int vectorSize, int[] values){
        this.inputs = new VectorInteger(vectorSize, values);

    }
    public Inputs(int vectorSize){
        int init_value = 0;
        int[] values = new int[vectorSize];
        for (int i = 0; i < vectorSize; i++){
            values[i] = init_value;
        }
        this.inputs = new VectorInteger(vectorSize, values);
    }
    public Inputs(int vectorSize, int init_value){
        int[] values = new int[vectorSize];
        for (int i = 0; i < vectorSize; i++){
            values[i] = init_value;
        }
        this.inputs = new VectorInteger(vectorSize, values);
    }

    public int get(int position){
        return inputs.get(position);
    }

}
