public class F1PitStop {

  public static void main(String[] args) {
    F1Team ferrari = new F1Team("Scuderia Ferrari", 1929);
    ferrari.introduceTeam();

    RaceDriver charlesLeclerc = new RaceDriver("Charles Leclerc");

    PitCrew pitCrew = new PitCrew();
    pitCrew.addMember(new JackMan("Antonio Rossi"));
    pitCrew.addMember(new WheelChanger("Sofia Bianchi", "Left Front"));
    pitCrew.addMember(new WheelChanger("Marco Verde", "Right Rear"));

    // Simulate pit stop
    charlesLeclerc.enterPitLane();
    pitCrew.performPitStop();
    charlesLeclerc.exitPitLane();

    System.out.println("Pit stop complete!");
  }
}