import org.junit.Test;
import static org.junit.Assert.*;

public class DataFlowTest {

    @Test
    public void test1(){
        double total = DataFlow.check_ticket(4);
        assertEquals(80, total, 1);
    }

    @Test
    public void test2(){
        double total = DataFlow.check_ticket(2);
        assertEquals(45, total, 1);
    }

    @Test
    public void test3(){
        double total = DataFlow.check_ticket(0);
        assertEquals(-1, total, 1);
    }


}