import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class Test_U01aKingsIsland {

    @Test
    public void testCalculateTotalCost() {
        // Test case 1
        int num_people1 = 3;
        double ticket_cost1 = 32.99;
        double parking_cost1 = 15.75;
        double gas_cost1 = 18.54;
        double expectedTotalCost1 = 133.26;
        double actualTotalCost1 = U01aKingsIslandApp.calculateTotalCost(num_people1, ticket_cost1, parking_cost1, gas_cost1);
        assertEquals(expectedTotalCost1, actualTotalCost1, 0.01);
    }
    @Test
    public void testCalculateTotalCost2() {
        // Test case 2
        int num_people2 = 4;
        double ticket_cost2 = 32.99;
        double parking_cost2 = 16.50;
        double gas_cost2 = 18.38;
        double expectedTotalCost2 = 166.84;
        double actualTotalCost2 = U01aKingsIslandApp.calculateTotalCost(num_people2, ticket_cost2, parking_cost2, gas_cost2);
        assertEquals(expectedTotalCost2, actualTotalCost2, 0.01);
    }

    @Test
    public void testCalculateCostPerPerson() {
        // Test case 1
        double total_cost1 = 133.26;
        int num_people1 = 3;
        double expectedCostPerPerson1 = 44.419999999999995;
        double actualCostPerPerson1 = U01aKingsIslandApp.calculateCostPerPerson(total_cost1, num_people1);
        assertEquals(expectedCostPerPerson1, actualCostPerPerson1, 0.01);
    }
    @Test
    public void testCalculateCostPerPerson2() {
        // Test case 2
        double total_cost2 = 166.84;
        int num_people2 = 4;
        double expectedCostPerPerson2 = 41.71;
        double actualCostPerPerson2 = U01aKingsIslandApp.calculateCostPerPerson(total_cost2, num_people2);
        assertEquals(expectedCostPerPerson2, actualCostPerPerson2, 0.01);
    }
}
