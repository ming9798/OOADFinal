package project;

public class User {
    private String firstName;
    private String lastName;
    private String dob;

    public Ticket getMyTicket() {
        return myTicket;
    }

    public void setMyTicket(Ticket myTicket) {
        this.myTicket = myTicket;
    }

    private Ticket myTicket;

    public User(){
        this.firstName = "";
        this.lastName = "";
        this.dob = "";
    }
    public User(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


}
