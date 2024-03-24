public class FrontJack extends PitCrewMember {
    public FrontJack(String name) {
        super(name, "Front Jack");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" task.");
    }
}