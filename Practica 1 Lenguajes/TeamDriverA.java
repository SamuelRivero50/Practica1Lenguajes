public class TeamDriverA {
    private PitCrewTeam pitCrewTeam;

    public void setPitCrewTeam(PitCrewTeam pitCrewTeam) {
        this.pitCrewTeam = pitCrewTeam;
    }

    public void performTask() {
        pitCrewTeam.performTask();
    }
}
