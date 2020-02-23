import org.testng.annotations.Test;

public class SimpleTest {
        @Test
        public void passingTest(){
            System.out.println("This test will always pass!");
        }

        @Test
    public void secondTest(){
            System.out.println("never failint Test");
        }
    }