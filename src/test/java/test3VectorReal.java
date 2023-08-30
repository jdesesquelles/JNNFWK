import org.example.VectorReal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test3VectorReal {

    @BeforeEach
    void SetUp() {

    }
    @Test
    void test1Vector(){
        int size = 1;
        double return_value = 0.0;
        double init_value = 1.1;
        double[] values = new double[size];
        for (int i = 0; i< size; i++){
            values[i] = init_value + i;
        }
        double expected_value = init_value;
        VectorReal vectorReal = new VectorReal(size, values);
        for (int i=0; i< size; i++) {
            return_value = vectorReal.get(i);
        }
        assertEquals(expected_value, return_value);
    }
    @Test
    void test2Vector(){
        int size = 1000;
        double[] return_value = new double[size];
        double init_value = 1.1;
        double[] expected_value = new double[size];
        double[] values = new double[size];
        for (int i = 0; i< size; i++){
            values[i] = init_value + i;
            expected_value[i] = values[i];
        }
        VectorReal vectorReal = new VectorReal(size, values);
        for (int i=0; i< size; i++) {
            return_value[i] = vectorReal.get(i);
        }
        for (int i=0; i< size; i++) {
            assertEquals(expected_value[i], return_value[i]);
        }

    }

}
