public class TeamDriverA {
    // Encapsulation
    // attributes are encapsulated
    private PitCrewTeam pitCrewTeam;

    // Constructor
    public void setPitCrewTeam(PitCrewTeam pitCrewTeam) {
        this.pitCrewTeam = pitCrewTeam;
    }

    public void performTask() {
        pitCrewTeam.performTask();
    }
}
