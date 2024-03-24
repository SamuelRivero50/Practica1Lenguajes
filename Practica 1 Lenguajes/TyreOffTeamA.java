public class TyreOffTeamA extends PitCrewMember {
    public TyreOffTeamA(String name) {
        super(name, "Tyre Off for Team A");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" for Team A");
    }
}
