import io.cucumber.skeleton.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBelly {
   Belly belly = new Belly();
   

   //test to check appraisal
   @Test
   public void eat(int cukes) {
      belly.eat(12);
      		
    //  assertEquals(500, appraisal, 0.0);
   }

   // test to check yearly salary
   @Test
   public void wait(int cukes) {
      belly.wait(12);
    //  assertEquals(96000, salary, 0.0);
   }
}