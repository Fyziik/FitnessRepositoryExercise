public class Person {

    private String name;
    private String CPR;

    public Person(String name, String CPR) {
        this.name = name;
        this.CPR = CPR;
    }

    public String getName() {
        return name;
    }

    public String getCPR() {
        return CPR;
    }

    public String toStringSimple() {
        return this.name + "\t  " + this.CPR;
    }
}
