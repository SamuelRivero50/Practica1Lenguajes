//Inheritance and Polymorphism
public class RearJack extends PitCrewMember {
    public RearJack(String name) {
        super(name, "Rear Jack");
    }

    public void performTask() {
        System.out.println("Performing task: " + getName() + " task.");
    }
}