package iley.Documents.GitHub.bradleycodeu.github.io._apcsa.u5a_wc.U05aPracticeFRQStepTracker;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class Test_StepTrackerTest {
	private Test_StepTracker cut;

	@Before
	public void setup() {
		this.cut = new Test_StepTracker();
	}

	@Test
	public void shouldCompile() {
		assertThat("Actual value", is("Expected value"));
	}
}