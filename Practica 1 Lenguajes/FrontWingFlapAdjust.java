public class FrontWingFlapAdjust extends PitCrewMember {
    public FrontWingFlapAdjust(String name) {
        super(name, "Front Wing Flap Adjust");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" task.");
    }
}