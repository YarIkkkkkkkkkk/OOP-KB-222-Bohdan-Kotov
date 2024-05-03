package lab3;

import java.util.ArrayList;

public class Bug extends Ticket {
    private UserStory userStory;

    public Bug(int id, String name, int estimate, UserStory userStory) {
        super(name, id, estimate);
        this.userStory = userStory;
    }

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (userStory == null || userStory.isCompleted() == false) {
            System.out.println("Can't create bug");
            return null;
        } else {
            System.out.println("Bug was created");

            return new Bug(id, name, estimate, userStory);
        }
    }

    public String toString() {
        return "[Bug " + id + "]" + userStory.getName() + name;
    }

    public static void main(String[] args) {
        UserStory us = new UserStory(1, "Implement login feature", 3, new ArrayList<>());
        us.complete();
        Bug bug = Bug.createBug(1, "Fix login page alignment issue", 2, us);
        System.out.println("Bug Details:");
        System.out.println(bug);
    }
}
