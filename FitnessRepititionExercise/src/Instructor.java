public class Instructor extends Employee{


    public Instructor(String name, String CPR, int workHours) {
        super(name, CPR);
        this.vacation = 0;
        this.workHours = workHours;
        this.salary = calculateSalary();
    }

    public int calculateSalary() {
        return this.workHours * 199;
    }


}
