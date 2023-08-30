import org.example.MatrixReal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test4MatrixReal {

    @BeforeEach
    void SetUp(){

    }

    @Test
    void testMatrixRealConstructor(){
        int row = 1;
        int col =1 ;
        int size = row * col;
        double[] expected_values = new double[size];
        expected_values[0] = 1.0;
        double[] return_values = new double[size];
        MatrixReal return_matrix = new MatrixReal(row, col, expected_values);
        //return_values = return_matrix.to_array();
        for (int i = 0; i < row; i++){
            for (int j =0; j < col; j++){
                return_values[i*col+j] = return_matrix.get(i,j);
                assertEquals(expected_values[i*col+j], return_values[i*col+j]);

            }
        }
        //assertEquals(expected_values[row+col-], return_values[row+col-2]);

    }

}
