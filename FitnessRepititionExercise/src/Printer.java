import java.util.List;

public class Printer {

    public void printEmployees(List<Employee> object) {
        System.out.println('\n' + "FITNESS EMPLOYEES" + '\n');
        System.out.println("Name " + '\t' + "  Cpr " + '\t' + '\t' + '\t' + "  Hours " + '\t' + "  Salary " + '\t' + "  Vacation");
        System.out.println("***********************************************************");
        for (Employee employee : object) {
            System.out.println(employee);
        }
        System.out.println("===========================================================" + '\n');
    }

    public void printMembers(List<Member> object) {
        System.out.println("FITNESS EMPLOYEES" + '\n');
        System.out.println("Name " + '\t' + "  Cpr " + '\t' + '\t' + '\t' + "  Member type " + '\t' + "  Fee");
        System.out.println("***********************************************************");
        for (Member member : object) {
            System.out.println(member);
        }
        System.out.println("===========================================================" + '\n');
    }

    public void printMix(List<Person> object) {
        System.out.println("EMPLOYEES & MEMBERS NAME AND CPR" + '\n');
        System.out.println("Name " + '\t' + "  Cpr");
        System.out.println("**************************");
        for (Person person : object) {
            System.out.println(person.toStringSimple());
        }
        System.out.println("===========================================================");
    }
}
