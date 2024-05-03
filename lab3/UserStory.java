package lab3;

import java.util.ArrayList;

import java.util.List;

public class UserStory extends Ticket {
    private List<UserStory> dependencies;

    public UserStory(int id, String name, int estimate, List<UserStory> dependencies) {
        super(name, id, estimate);
        this.dependencies = new ArrayList<>(dependencies);
    }

    public void complete() {
        boolean allDependenciesCompleted = dependencies.stream().allMatch(UserStory::isCompleted);
        if (allDependenciesCompleted) {
            super.complete();
            System.out.println("Sucsesfull completing " + toString());
        } else {
            System.out.println("Unsucsess completing " + toString());

        }
    }

    public List<UserStory> getDependencies() {

        return new ArrayList<>(dependencies);
    }

    @Override
    public String toString() {
        return "[US " + id + "]" + name;

    }

    public static void main(String[] args) {
        UserStory us1 = new UserStory(1, "Implement login feature", 3, new ArrayList<>());
        UserStory us2 = new UserStory(2, "Implement registration feature", 5, new ArrayList<>());
        UserStory us3 = new UserStory(3, "Implement profile page", 4, new ArrayList<>());
        us3.dependencies.add(us1);
        us3.dependencies.add(us2);
        System.out.println("User Stories:");
        System.out.println(us1);
        System.out.println(us2);
        System.out.println(us3);
        System.out.println("Dependencies of User Story 3:");
        for (UserStory dependency : us3.getDependencies()) {
            System.out.println(dependency);
        }
        us1.complete();
        us3.complete();
        System.out.println("User Stories status after completion:");
        System.out.println(us1.getName() + " Completed: " + us1.isCompleted());
        System.out.println(us2.getName() + "Completed: " + us2.isCompleted());
        System.out.println(us3.getName() + " Completed: " + us3.isCompleted());
    }
}