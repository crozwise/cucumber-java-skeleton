import io.cucumber.skeleton.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBelly {
   Belly belly = new Belly();
   

   //test to check appraisal
//   @Test
//   public void eat(int cukes) {
      
      		
    //  assertEquals(500, appraisal, 0.0);
//   }

   // test to check yearly salary
   @Test
   public void growl() {

     String result = belly.growl();

     assertEquals("growl function is running", result);

      
    //  assertEquals(96000, salary, 0.0);
   }
   @Test
   public String dummy() {

     String result = belly.dummy();

     assertEquals("dummy function is running", result);

      
    //  assertEquals(96000, salary, 0.0);
   }
}