public class Developer extends  Employee {



    double over_time_hours;
   Developer(double over_time_hours, int  base_salary,double attendance_days,int rating)
    {
    super(base_salary,attendance_days,rating);
    this.over_time_hours= over_time_hours;
    }


    //GrossSalary = BaseSalary + (OvertimeHours * 500)
    @Override
    void calculate_gross_salary()
    {
        gross_salary = base_salary + (over_time_hours * 500);
        System.out.println("Gross Salary is: "+ gross_salary);
    }
}
