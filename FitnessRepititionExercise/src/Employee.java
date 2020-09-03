public class Employee extends Person {

    protected double salary;
    protected int workHours;
    protected int vacation;


    public Employee(String name, String CPR) {
        super(name, CPR);
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getVacation() {
        return vacation;
    }

    public String toString() {
        return this.getName() + '\t' + "  " + this.getCPR() + '\t' + "  " + this.getWorkHours() + '\t' + '\t' + "  " + Math.round(this.getSalary()) + '\t' + '\t' + "  " + this.getVacation();
    }
}
