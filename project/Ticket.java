package project;

public class Ticket {
    private String toDestination;

    public Ticket(String toDestination, String fromPlace, String date, String time, String gate, double price) {
        this.toDestination = toDestination;
        this.fromPlace = fromPlace;
        this.date = date;
        this.time = time;
        this.gate = gate;
        this.price = price;
    }

    private String fromPlace;
    private String date;
    private String time;
    private String gate;
    private double price;

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
