public class Worker extends Person
{
    double hourlyPayRate;

    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s%-20s%-20s", getIDNum(), getFirstName(), getLastName(), getTitle(), getYOB(), getHourlyPayRate());
    }


    public double calculateWeeklyPay(double hoursWorked)
    {
        double hourlyWage = getHourlyPayRate();
        double weeklyPay;
        double overtime;
        double overtimeWage = hourlyWage * 1.5;

        if (hoursWorked <= 40)
        {
            weeklyPay = hourlyWage * hoursWorked;
        }
        else
        {
            weeklyPay = hourlyWage * 40;
            overtime = hoursWorked - 40;
            weeklyPay += overtime * overtimeWage;
        }

        return weeklyPay;
    }

    public double calculateWeeklyPay()
    {
        return 0;
    }

    String displayWeeklyPay(double hoursWorked)
    {
        double regWorkHours;
        double hourlyWage = getHourlyPayRate();
        double regularPay;
        double overtime = 0;
        double overtimePay = 0;
        double overtimeWage = hourlyWage * 1.5;
        double weeklyPay = calculateWeeklyPay(hoursWorked);

        if(hoursWorked <= 40)
        {
            regWorkHours = hoursWorked;
            regularPay = regWorkHours * hourlyWage;
        }
        else
        {
            regWorkHours = 40;
            regularPay = regWorkHours * hourlyWage;
            overtime = hoursWorked - 40;
            overtimePay = overtime * overtimeWage;
        }

        return "The number of regular hours worked was " + regWorkHours + " hours with a total pay of $" + regularPay + ". The number of overtime hours was "
                + overtime + " hours with a total pay of $" + overtimePay + ". The total combined pay was $" + weeklyPay + ".";

    }

    String displayWeeklyPay()
    {
        return "";
    }
}
