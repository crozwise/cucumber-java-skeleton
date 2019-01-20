import io.cucumber.skeleton.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBelly {
   Belly belly = new Belly();
   

   @Test
   public void growl() {

     String result = belly.growl();

     assertEquals("growl function is running", result);

      
    
   }
   @Test
   public void dummy() {

     String result = belly.dummy();

     assertEquals("dummy function is running", result);

   }
}