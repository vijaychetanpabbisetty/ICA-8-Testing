import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class urinalsTest {
    //Testcases


    @Test
    public void test_pass_or_fail() {
        System.out.println("====== Vijaychetan == TEST ZERO EXECUTED =========");
        assertEquals(5, 5);

    }

    @Test
    public void testValidation() {
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

    @Test
    public void testTheLengthOfTheString() {
        System.out.println(" ====== Vijaychetan ==== TEST TWO EXECUTED =======");
        assertEquals(true, urinals.gbstring("100001"));

        assertEquals(false, urinals.gbstring("000000000000000000000000000000"));

        assertEquals(true, urinals.gbstring("0"));
    }

    @Test
    public void check11() {
        System.out.println(" ====== Vijaychetan ==== TEST THREE EXECUTED =======");
        assertEquals(false, urinals.gbstring("11"));
        assertEquals(true, urinals.gbstring("10101"));
        assertEquals(true, urinals.gbstring("000"));
    }

    @Test
    public void checkStringForTheOutput() {
        System.out.println(" ====== Vijaychetan ==== TEST FOUR EXECUTED =======");
        assertEquals(1, urinals.number_of_free_urinals("10001"));
        assertEquals(0, urinals.number_of_free_urinals("1001"));
        assertEquals(3, urinals.number_of_free_urinals("00000"));
        assertEquals(2, urinals.number_of_free_urinals("0000"));

    }




    }
