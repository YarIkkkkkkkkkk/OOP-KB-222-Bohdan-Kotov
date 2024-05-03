package lab3;

import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int capicity;
    private int ticketLimit;
    private List<Ticket> tickets;

    public Sprint(int capicity, int ticketlimit) {
        this.capicity = capicity;
        this.ticketLimit = ticketlimit;
        this.tickets = new ArrayList<>();
    }

    public void addUserStory(UserStory userStory) {
        if (userStory != null && userStory.isCompleted() == false && issprintfull(userStory, capicity, ticketLimit)) {
            if (tickets.add(userStory)) {
                System.out.println("Sucsesfull added User Story");
            }
        } else {
            System.out.println("Unsucsess added User Story");
        }
    }

    public void addBug(Bug bug) {
        if (bug != null && bug.isCompleted() == false && issprintfull(bug, capicity, ticketLimit)) {
            if (tickets.add(bug)) {
                System.out.println("Sucsesfull added Bug");
            }
        } else {
            System.out.println("Unsucsess added Bug");
        }
    }

    public List<Ticket> getTickets() {
        List<Ticket> ticketsCopy = new ArrayList<>(tickets);
        return ticketsCopy;
    }

    public boolean issprintfull(Ticket ticket, int capicity, int ticketLimit) {
        if (ticket.getEstimate() + getTotalEstimate() > capicity || (tickets.size() + 1) > ticketLimit) {
            return false;
        } else {
            return true;
        }
    }

    public int getTotalEstimate() {
        int TotalEstimate = 0;
        for (Ticket ticket : tickets) {

            TotalEstimate += ticket.getEstimate();
        }
        return TotalEstimate;
    }

    public static void main(String[] args) {
        Sprint sprint = new Sprint(20, 4);

        UserStory us1 = new UserStory(1, "Implement login feature", 3, new ArrayList<>());
        UserStory us2 = new UserStory(2, "Implement registration feature", 5, new ArrayList<>());
        UserStory us3 = new UserStory(3, "Implement profile page", 4, new ArrayList<>());

        us1.complete();

        Bug bug1 = Bug.createBug(1, "Fix login page alignment issue", 2, us1);
        Bug bug2 = Bug.createBug(2, "Fix registration form validation bug", 1, us2);

        sprint.addUserStory(us1);
        sprint.addUserStory(us2);
        sprint.addUserStory(us3);
        sprint.addBug(bug1);
        sprint.addBug(bug2);

        System.out.println("Tickets in Sprint:");
        for (Ticket ticket : sprint.getTickets()) {
            System.out.println(ticket);
            System.out.println("Total Estimate of Sprint:" + sprint.getTotalEstimate());
        }
    }
}
