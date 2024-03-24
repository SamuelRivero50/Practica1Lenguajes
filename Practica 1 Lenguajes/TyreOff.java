public class TyreOff extends PitCrewMember {
    public TyreOff(String name) {
        super(name, "Tyre Off");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" task.");
    }
}
