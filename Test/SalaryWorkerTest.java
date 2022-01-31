import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {

    SalaryWorker carl;

    @BeforeEach
    void setUp() {
        carl = new SalaryWorker("000001", "carl", "crab", "Sir.", 2000, 25, 100000);
    }

    @Test
    void getAnnualSalary() {
        assertEquals(100000, carl.annualSalary);
    }

    @Test
    void setAnnualSalary() {
        carl.setAnnualSalary(50000);
        assertEquals(50000, carl.getAnnualSalary());
    }

    @Test
    void testToString() {
        String expected = String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", carl.getIDNum(), carl.getFirstName(), carl.getLastName(), carl.getTitle(), carl.getYOB(), carl.getHourlyPayRate(), carl.getAnnualSalary());
        assertEquals(expected, carl.toString());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1923.08, carl.calculateWeeklyPay());
    }

    @Test
    void displayWeeklyPay() {
        double weeklyPay = carl.calculateWeeklyPay();
        String sentence = "The weekly pay is $" + weeklyPay + " of the annual salary of $" + carl.getAnnualSalary();
        assertEquals(sentence, carl.displayWeeklyPay());
    }
}
