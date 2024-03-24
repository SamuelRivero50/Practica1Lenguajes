//Inheritance and Polymorphism
public class TyreOffTeamB extends PitCrewMember {
    public TyreOffTeamB(String name) {
        super(name, "Tyre Off for Team B");
    }

    public void performTask() {
        System.out.println("Performing task: " + getName() + " for Team B");
    }
}