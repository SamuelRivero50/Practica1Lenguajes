//Inheritance and Polymorphism
public class TyreOn extends PitCrewMember {
    public TyreOn(String name) {
        super(name, "Tyre On");
    }

    public void performTask() {
        System.out.println("Performing task: " + getName() + " task.");
    }
}
