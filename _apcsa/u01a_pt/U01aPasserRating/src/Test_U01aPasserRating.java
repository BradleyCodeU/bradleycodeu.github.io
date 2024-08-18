
import static org.junit.Assert.*;
import org.junit.Test;

public class Test_U01aPasserRating {

    @Test
    public void testCalculateNFLRating_TomBrady() {
        int attempts = 432;
        int completions = 291;
        int yards = 3554;
        int touchdowns = 28;
        int interceptions = 2;

        double expectedNFLRating = 112.17206790123457; // Calculated externally
        double actualNFLRating = U01aPasserRating.calculateNFLRating(attempts, completions, yards, touchdowns, interceptions);

        assertEquals(expectedNFLRating, actualNFLRating, 0.0001); // Using delta for double comparison
    }

    @Test
    public void testCalculateCollegeRating_TomBrady() {
        int attempts = 432;
        int completions = 291;
        int yards = 3554;
        int touchdowns = 28;
        int interceptions = 2;

        double expectedCollegeRating = 156.92962962962963; // Calculated externally
        double actualCollegeRating = U01aPasserRating.calculateCollegeRating(attempts, completions, yards, touchdowns, interceptions);

        assertEquals(expectedCollegeRating, actualCollegeRating, 0.0001); // Using delta for double comparison
    }
    
    @Test
    public void testCalculateNFLRating_AaronRodgers() {
        int attempts = 502;
        int completions = 343;
        int yards = 4643;
        int touchdowns = 45;
        int interceptions = 6;

        double expectedNFLRating = 122.46015936254979; // Calculated externally
        double actualNFLRating = U01aPasserRating.calculateNFLRating(attempts, completions, yards, touchdowns, interceptions);

        assertEquals(expectedNFLRating, actualNFLRating, 0.0001); // Using delta for double comparison
    }

    @Test
    public void testCalculateCollegeRating_AaronRodgers() {
        int attempts = 502;
        int completions = 343;
        int yards = 4643;
        int touchdowns = 45;
        int interceptions = 6;

        double expectedCollegeRating = 173.20956175298807; // Calculated externally
        double actualCollegeRating = U01aPasserRating.calculateCollegeRating(attempts, completions, yards, touchdowns, interceptions);

        assertEquals(expectedCollegeRating, actualCollegeRating, 0.0001); // Using delta for double comparison
    }
}
