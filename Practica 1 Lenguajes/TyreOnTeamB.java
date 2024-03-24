public class TyreOnTeamB extends PitCrewMember {
    public TyreOnTeamB(String name) {
        super(name, "Tyre On for Team B");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" for Team B");
    }
}