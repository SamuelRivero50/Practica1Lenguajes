public class TyreGunnerTeamA extends PitCrewMember {
    public TyreGunnerTeamA(String name) {
        super(name, "Tyre Gunner for Team A");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" for Team A");
    }
}