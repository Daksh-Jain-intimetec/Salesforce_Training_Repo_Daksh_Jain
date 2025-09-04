import org.junit.Test;
import org.junit.jupiter.api.*;

public class MainTest {
    @BeforeAll
    public static void beforTest(){   
        System.out.println("Starting to Test All Test_Cases.....");
    }

    @AfterAll
    public static void afterTest(){
        System.out.println("All Test_cases Run Successfully.....");
    }

    @BeforeEach
    public void nextTest(){
        System.out.println("Starting New UnitTest.....");
    }

    @AfterEach
    public void endTest(){
        System.out.println("UnitTest Ended Here.....");
    }

    @Test
    public void addTwoNumTest(){
        int actualResult = Main.addTwoNum(10,12);
        int expectedResult = 22;
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
