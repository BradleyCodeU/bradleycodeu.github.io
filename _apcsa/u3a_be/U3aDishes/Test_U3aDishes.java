import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class Test_3aDishes {



@Test
public void taskNeeded_allFour() {
  // Enter code here
  // all 4
  assertEquals(
    true,
    U3aDishes.tasksNeeded(true,false,3,0.5).toLowerCase().indexOf("homework")>-1 && U3aDishes.tasksNeeded(true,false,3,0.5).toLowerCase().indexOf("dishes")>-1 && U3aDishes.tasksNeeded(true,false,3,0.5).toLowerCase().indexOf("math")>-1 && U3aDishes.tasksNeeded(true,false,3,0.5).toLowerCase().indexOf("piano")>-1 
  );
}


@Test
public void taskNeeded_lastThree() {
  // Enter code here
    // last 3
    assertEquals(
      true,
  U3aDishes.tasksNeeded(false,false,2,7.5).toLowerCase().indexOf("homework")==-1 && U3aDishes.tasksNeeded(false,false,2,7.5).toLowerCase().indexOf("dishes")>-1 && U3aDishes.tasksNeeded(false,false,2,7.5).toLowerCase().indexOf("math")>-1 && U3aDishes.tasksNeeded(false,false,2,7.5).toLowerCase().indexOf("piano")> -1
    );
}


@Test
public void taskNeeded_firstThree() {
  // Enter code here
  // first 3
  assertEquals(
    true,
    U3aDishes.tasksNeeded(true,false,3,11.5).toLowerCase().indexOf("homework")>-1 && U3aDishes.tasksNeeded(true,false,3,11.5).toLowerCase().indexOf("dishes")>-1 && U3aDishes.tasksNeeded(true,false,3,11.5).toLowerCase().indexOf("math")>-1 && U3aDishes.tasksNeeded(true,false,3,11.5).toLowerCase().indexOf("piano") == -1
  );
}


@Test
public void taskNeeded_lastTwo() {
  // Enter code here
    // last 2
    assertEquals(
      true,
  U3aDishes.tasksNeeded(false,true,0,0.0).toLowerCase().indexOf("homework")==-1 && U3aDishes.tasksNeeded(false,true,0,0.0).toLowerCase().indexOf("dishes")==-1 && U3aDishes.tasksNeeded(false,true,0,0.0).toLowerCase().indexOf("math") > -1 && U3aDishes.tasksNeeded(false,true,0,0.0).toLowerCase().indexOf("piano") > -1
    );
}


@Test
public void taskNeeded_firstTwo() {
  // Enter code here
  // first 2
  assertEquals(
    true,
    U3aDishes.tasksNeeded(true,false,5,11.5).toLowerCase().indexOf("homework")>-1 && U3aDishes.tasksNeeded(true,false,5,11.5).toLowerCase().indexOf("dishes")>-1 && U3aDishes.tasksNeeded(true,false,5,11.5).toLowerCase().indexOf("math") == -1 && U3aDishes.tasksNeeded(true,false,5,11.5).toLowerCase().indexOf("piano") == -1
  );
}


@Test
public void taskNeeded_goOut() {
  // Enter code here
  assertEquals(
    true,
    U3aDishes.tasksNeeded(false,true,5,11.5).toLowerCase().indexOf("you can go out")>-1 && U3aDishes.tasksNeeded(false,true,5,11.5).toLowerCase().indexOf("homework")==-1 && U3aDishes.tasksNeeded(false,true,5,11.5).toLowerCase().indexOf("dishes")==-1 && U3aDishes.tasksNeeded(false,true,5,11.5).toLowerCase().indexOf("math")==-1 && U3aDishes.tasksNeeded(false,true,5,11.5).toLowerCase().indexOf("piano")==-1 
    );
}


@Test
public void taskNeeded_justDishes() {
  // Enter code here

  // just dishes
  assertEquals(
    true,
    U3aDishes.tasksNeeded(false,false,14,19.9).toLowerCase().indexOf("homework")==-1 && U3aDishes.tasksNeeded(false,false,14,19.9).toLowerCase().indexOf("dishes")>-1 && U3aDishes.tasksNeeded(false,false,14,19.9).toLowerCase().indexOf("math")==-1 && U3aDishes.tasksNeeded(false,false,14,19.9).toLowerCase().indexOf("piano")==-1 
  );
}



@Test
public void taskNeeded_justMath() {
  // Enter code here
  // just math
  assertEquals(
    true,
    U3aDishes.tasksNeeded(false,true,1,19.9).toLowerCase().indexOf("homework")==-1 && U3aDishes.tasksNeeded(false,true,1,19.9).toLowerCase().indexOf("dishes")==-1 && U3aDishes.tasksNeeded(false,true,1,19.9).toLowerCase().indexOf("math")>-1 && U3aDishes.tasksNeeded(false,true,1,19.9).toLowerCase().indexOf("piano")==-1 
  );
}


@Test
public void taskNeeded_justPiano() {
  // Enter code here
  // just piano
  assertEquals(
    true,
    U3aDishes.tasksNeeded(false,true,4,9.9).toLowerCase().indexOf("homework")==-1 && U3aDishes.tasksNeeded(false,true,4,9.9).toLowerCase().indexOf("dishes")==-1 && U3aDishes.tasksNeeded(false,true,4,9.9).toLowerCase().indexOf("math")==-1 && U3aDishes.tasksNeeded(false,true,4,9.9).toLowerCase().indexOf("piano")>-1 
  );
}


@Test
public void taskNeeded_justHomework() {
  // Enter code here
  assertEquals(
    true,
    U3aDishes.tasksNeeded(true,true,5,11.5).toLowerCase().indexOf("homework")>-1 && U3aDishes.tasksNeeded(true,true,5,11.5).toLowerCase().indexOf("dishes")==-1 && U3aDishes.tasksNeeded(true,true,5,11.5).toLowerCase().indexOf("math") == -1 && U3aDishes.tasksNeeded(true,true,5,11.5).toLowerCase().indexOf("piano") == -1
  );
}


@Test
public void canGoOut_test() {
    assertEquals(true, U3aDishes.canGoOut(false, true, 4, 10.0));
    assertEquals(true, U3aDishes.canGoOut(false, true, 5, 11.0));
    assertEquals(false, U3aDishes.canGoOut(true, true, 4, 10.5));
    assertEquals(false, U3aDishes.canGoOut(false, false, 4, 10.9));
    assertEquals(false, U3aDishes.canGoOut(false, true, 3, 10.3));
    assertEquals(false, U3aDishes.canGoOut(false, true, 4, 9.5));
    assertEquals(false, U3aDishes.canGoOut(true, false, 0, 0.9));
  
}
}
