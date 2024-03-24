public class LollipopMan extends PitCrewMember {
    public LollipopMan(String name) {
        super(name, "Lollipop Man");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" task.");
    }
}