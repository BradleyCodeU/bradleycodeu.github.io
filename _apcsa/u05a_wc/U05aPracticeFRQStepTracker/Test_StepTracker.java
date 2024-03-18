




// import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
// import static org.mockito.Mockito.*;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
// import org.mockito.ArgumentCaptor;
// import org.mockito.Mock;
// import org.mockito.junit.MockitoJUnitRunner;

public class Test_StepTracker {

    
    
    @Test
    public void averageSteps_zero_days_test() {
      StepTracker tr = new StepTracker(10000);
      assertEquals(0.0, tr.averageSteps(),0.0000001);
    
    }
    
    @Test
    public void averageSteps_test() {
      // Enter code here
      StepTracker tr = new StepTracker(10000);
      tr.addDailySteps(9999);
      tr.addDailySteps(10000);
      tr.addDailySteps(10001);
      assertEquals(10000.0, tr.averageSteps(),0.000001);
      tr.addDailySteps(1);
      tr.addDailySteps(2);
      tr.addDailySteps(3);
      assertEquals(5001.0, tr.averageSteps(),0.000001);
    }
    
    @Test
    public void addDailySteps_and_activeDays_test() {
      StepTracker tr = new StepTracker(10000);
      tr.addDailySteps(10000);
      tr.addDailySteps(10001);
      tr.addDailySteps(10002);
      assertEquals(3, tr.activeDays());
      tr.addDailySteps(9999);
      tr.addDailySteps(10000);
      tr.addDailySteps(10000);
      assertEquals(5, tr.activeDays());
    }
    
    @Test
public void activeDays_test() {
  StepTracker tr = new StepTracker(10000);
  assertEquals(0, tr.activeDays());
}


@Test
public void constructor_test() {
  StepTracker tr = new StepTracker(10000);
  assertEquals(true, tr instanceof StepTracker);
}
}








