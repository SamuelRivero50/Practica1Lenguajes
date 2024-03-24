public class Steadier extends PitCrewMember {
    public Steadier(String name) {
        super(name, "Steadier");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" task.");
    }
}