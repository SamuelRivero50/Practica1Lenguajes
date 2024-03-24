public class TyreOnTeamA extends PitCrewMember {
    public TyreOnTeamA(String name) {
        super(name, "Tyre On for Team A");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" for Team A");
    }
}
