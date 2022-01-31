import java.util.ArrayList;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        ArrayList <Worker> workersList = new ArrayList<>();
        int week = 1;
        double hoursWorked;

        //3 workers
        Worker clark = new Worker ("000001", "Clark", "Kent", "Mr.", 1970, 20);
        workersList.add(clark);
        Worker bruce = new Worker ("000002", "Bruce", "Wayne", "Mr.", 1980, 50);
        workersList.add(bruce);
        Worker barry = new Worker ("000003", "Barry", "Allen", "Mr.", 1990, 15);
        workersList.add(barry);

        //3 salaried workers
        SalaryWorker grog = new SalaryWorker("000004", "Grog", "Strongjaw", "Sir.", 2000, 0, 50000);
        workersList.add(grog);
        SalaryWorker pike = new SalaryWorker("000005", "Pike", "Trickfoot", "Mrs.", 1999, 0, 100000);
        workersList.add(pike);
        SalaryWorker scanlan = new SalaryWorker("000006", "Scanlan", "Shorthalt", "Mr.", 1999, 0,75000);
        workersList.add(scanlan);

        for (int i = 1; i <= 3; i++)
        {
            System.out.println("\nWeek " + week);

            if(week == 2)
            {
                hoursWorked = 50;
            }
            else
            {
                hoursWorked = 40;
            }

            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "IDNum#", "Firstname", "Lastname", "Title", "YOB", "HourlyPayRate", "AnnualSalary", "HoursWorked", "WeeklyWage");
            System.out.println("=".repeat(180));
            for (Worker worker: workersList)
            {
                if(worker.getIDNum() == "000001" || worker.getIDNum() == "000002" || worker.getIDNum() == "000003")
                {
                    System.out.printf("%-20s%-20s%-20s%-20s\n\n", worker.toString(), "N/A", hoursWorked, worker.calculateWeeklyPay(hoursWorked));
                }
                else
                {
                    System.out.printf("%-20s%-20s%-20s\n\n", worker.toString(), hoursWorked, worker.calculateWeeklyPay());
                }
            }

            week++;
        }

    }
}
