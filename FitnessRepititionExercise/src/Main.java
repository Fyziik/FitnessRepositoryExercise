import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create list of employees
        List<Employee> employees = new ArrayList<>();

        // Create list of members
        List<Member> members = new ArrayList<>();

        // Create list of employees and members mixed
        List<Person> combinedList = new ArrayList<>();

        // Create each employee
        Administration claus = new Administration("Claus", "221175-1011");
        Instructor tove = new Instructor("Tove", "011080-1014", 20);
        Administration anna = new Administration("Anna", "011080-1012");
        Instructor henning = new Instructor("Henning", "011080-1013", 15);

        //Create each member
        Member morten = new Member("Morten", "130195-1303", "Full");
        Member martin = new Member("Martin", "221175-1011", "Basic");
        Member martina = new Member("Martina", "050970-1409", "Full");
        Member marcel = new Member("Marcel", "221175-1011", "Basic");



        // Add all employees to list of employees
        employees.add(claus);
        employees.add(tove);
        employees.add(anna);
        employees.add(henning);

        // Add all fitness members to list of members
        members.add(morten);
        members.add(martin);
        members.add(martina);
        members.add(marcel);

        //Add all employees & members to mixed list
        combinedList.addAll(employees);
        combinedList.addAll(members);

        // Create printer object
        Printer printer = new Printer();
        printer.printEmployees(employees);
        printer.printMembers(members);
        printer.printMix(combinedList);

    }

}
