public class SalaryWorker extends Worker
{
    double annualSalary;

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return String.format("%20s%-20s", super.toString(), getAnnualSalary());
    }


    @Override
    public double calculateWeeklyPay()
    {
        double payTotal = getAnnualSalary() / 52;
        payTotal = (double)Math.round(payTotal * 100d) /100d;
        return payTotal;
    }

    @Override
    public String displayWeeklyPay()
    {
        double weeklyPlay = calculateWeeklyPay();
        return "The weekly pay is $" + calculateWeeklyPay() + " of the annual salary of $" + getAnnualSalary();
    }
}
