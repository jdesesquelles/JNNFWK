import org.example.ScalarReal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test1ScalarReal {
    @BeforeEach
    void setUp() {
    }
    @Test
    void testScalarRealConstructor(){
        //assertTrue(fileGenerator != null);
        Double expected_value = 1.02;
        Double return_value = 0.0;
        ScalarReal value = new ScalarReal(expected_value);
        return_value = value.get();
        assertEquals(expected_value, return_value);
    }
    @Test
    void test2ScalarRealConstructor(){
        Double expected_value = 1.02;
        Double return_value = 0.0;
        ScalarReal value = new ScalarReal(expected_value);
        return_value = value.get();
        assertEquals(expected_value, return_value);
    }
}
