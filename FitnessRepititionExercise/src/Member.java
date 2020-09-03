public class Member extends Person{

    private String membership;
    private int fee;

    public Member(String name, String CPR, String membership) {
        super(name, CPR);
        this.membership = membership;
        setFee(membership);
    }

    public void setFee(String membership) {
        if (membership.toUpperCase().equals("FULL")) {
            this.fee = 299;
        }
        else {
            this.fee = 199;
        }
    }

    public String toString() {
        return this.getName() + '\t' + "  " + this.getCPR() + '\t' + "  " + this.membership + "\t\t\t  " + this.fee;
    }
}
