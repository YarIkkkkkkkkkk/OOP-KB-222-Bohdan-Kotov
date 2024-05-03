package lab3;

public class Ticket {
    protected boolean iscompleted;
    protected String name;
    protected int id;
    protected int estimate;

    public Ticket(String name, int id, int estimate) {
        this.iscompleted = false;
        this.name = name;
        this.id = id;
        this.estimate = estimate;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEstimate() {
        return estimate;
    }

    public boolean isCompleted() {
        return iscompleted;
    }

    public void complete() {
        iscompleted = true;
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket("Test Ticket", 1, 2);
        System.out.println("Ticket Details:");
        System.out.println("ID: " + ticket.getID());
        System.out.println("Name: " + ticket.getName());
        System.out.println("Estimate: " + ticket.getEstimate());
        System.out.println("Completed: " + ticket.isCompleted());
        ticket.complete();
        System.out.println("Completed: " + ticket.isCompleted());
    }
}