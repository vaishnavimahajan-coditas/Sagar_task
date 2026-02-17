public class Manager extends  Employee{

//    GrossSalary = BaseSalary + (TeamSize * 1000)
    int team_size;
    Manager(int team_size,int base_salary,double attendance_days,int rating )
    {
    super(base_salary,attendance_days,rating);
    this.team_size =team_size;
    }
    @Override
    void calculate_gross_salary() {
    gross_salary = base_salary +(team_size * 1000);
        System.out.println("Gross Salary is : "+gross_salary);
    }
}
