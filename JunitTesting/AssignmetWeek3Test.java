import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import WEEK3.*;

public class AssignmetWeek3Test {

    private List<Plan> planList;

    @BeforeEach
    public void setUp() {
        planList = new ArrayList<>();
        planList.add(new Plan("Basic", 99.99, 30, 28));
        planList.add(new Plan("Advance2", 299, 60, 56));
        planList.add(new Plan("UltraMax", 699.99, 100, 84));
        planList.add(new Plan("Prime", 149.99, 40, 28));
        planList.add(new Plan("Advance3", 399, 80, 56));
        planList.add(new Plan("Prime2", 199.99, 60, 28));
        planList.add(new Plan("Advance", 249.99, 40, 56));
        planList.add(new Plan("Ultra1", 549.99, 60, 84));
    }

    @Test
    public void testPriceComparatorSorting() {
        planList.sort(new PriceComparator());
        assertEquals("Basic", planList.get(0).toString().split(" ")[1]); // cheapest should be Basic
        assertEquals("UltraMax", planList.get(planList.size()-1).toString().split(" ")[1]); // costliest should be UltraMax
    }

    @Test
    public void testSpeedComparatorSorting() {
        planList.sort(new SpeedComparator());
        assertTrue(planList.get(0).getSpeed() <= planList.get(1).getSpeed());
        assertTrue(planList.get(planList.size()-1).getSpeed() >= planList.get(0).getSpeed());
    }

    @Test
    public void testValidityComparatorSorting() {
        planList.sort(new ValidityComparator());
        assertTrue(planList.get(0).getValidity() <= planList.get(1).getValidity());
        assertTrue(planList.get(planList.size()-1).getValidity() >= planList.get(0).getValidity());
    }

    @Test
    public void testSearchBySpeedFound() {
        double searchSpeed = 100;
        boolean found = planList.stream().anyMatch(p -> p.getSpeed() == searchSpeed);
        assertTrue(found, "Plan with 100 Mbps should exist");
    }

    @Test
    public void testSearchByValidityNotFound() {
        int searchDays = 999;
        boolean found = planList.stream().anyMatch(p -> p.getValidity() == searchDays);
        assertFalse(found, "Plan with 999 days should not exist");
    }

    @Test
    public void testPlanListNotEmpty() {
        assertFalse(planList.isEmpty(), "Plan list should not be empty");
    }
}
