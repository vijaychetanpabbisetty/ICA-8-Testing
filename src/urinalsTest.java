import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class urinalsTest {
    //Testcases


    @Test
    public void test_pass_or_fail() {
        System.out.println("====== Vijaychetan == TEST ZERO EXECUTED =========");
       assertEquals(5,5);

}
    @Test
    public void testValidation(){
        System.out.println(" ====== Vijaychetan ==== TEST ONE EXECUTED =======");
        assertEquals(true, urinals.gbstring("100001"));
        assertEquals(true, urinals.gbstring("10101"));
        assertEquals(true, urinals.gbstring("0000"));
        assertEquals(true, urinals.gbstring("0000010"));
        assertEquals(true, urinals.gbstring("10000"));
        assertEquals(false, urinals.gbstring("(701323)"));
        assertEquals(false, urinals.gbstring("0000@V2chet05"));
        assertEquals(false, urinals.gbstring("08888-[]001"));
    }

    }

