import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorkerTest
{
    Worker carl;

    @BeforeEach
    void setUp() {
        carl = new Worker("000001", "carl", "crab", "Sir.", 2000, 25);
    }

    @Test
    void getHourlyPayRate() {
        assertEquals(25, carl.getHourlyPayRate());
    }

    @Test
    void setHourlyPayRate() {
        carl.setHourlyPayRate(20);
        assertEquals(20, carl.getHourlyPayRate());
    }

    @Test
    void testToString() {
        String expected = String.format("%-20s%-20s%-20s%-20s%-20s%-20s", carl.getIDNum(), carl.getFirstName(), carl.getLastName(), carl.getTitle(), carl.getYOB(), carl.getHourlyPayRate());
        assertEquals(expected, carl.toString());
    }

    @Test
    void calculateWeeklyPay() {
        double pay = carl.calculateWeeklyPay(45);
        assertEquals(1187.5, pay);
    }

    @Test
    void displayWeeklyPay() {
        String sentence = "The number of regular hours worked was 40.0 hours with a total pay of $1000.0. The number of overtime hours was 5.0 hours with a total" +
                " pay of $187.5. The total combined pay was $1187.5.";
        assertEquals(sentence, carl.displayWeeklyPay(45));
    }

}
