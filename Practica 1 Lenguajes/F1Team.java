public class F1Team {
    private String name;
    private int foundationYear;
    private PitCrewTeam pitCrewTeam;
    private TeamDriverA teamDriverA;
    private TeamDriverB teamDriverB;

    public F1Team(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.pitCrewTeam = new PitCrewTeam();
        this.teamDriverA = new TeamDriverA();
        this.teamDriverB = new TeamDriverB();
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public PitCrewTeam getPitCrewTeam() {
        return pitCrewTeam;
    }

    public TeamDriverA getTeamDriverA() {
        return teamDriverA;
    }

    public TeamDriverB getTeamDriverB() {
        return teamDriverB;
    }
}