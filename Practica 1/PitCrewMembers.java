import java.util.ArrayList;
import java.util.List;

class PitCrew {
  private List<PitCrewMember> members;

  public PitCrew() {
    this.members = new ArrayList<>();
  }

  public void addMember(PitCrewMember member) {
    members.add(member);
  }

  public void performPitStop() {
    for (PitCrewMember member : members) {
      member.performTask();
    }
  }
}