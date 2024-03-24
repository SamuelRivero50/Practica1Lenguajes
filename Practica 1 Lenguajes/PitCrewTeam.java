import java.util.ArrayList;
import java.util.List;

public class PitCrewTeam {

    // Encapsulation
    // attributes are encapsulated
    private List<PitCrewMember> pitCrewMembers;

    public PitCrewTeam() {
        pitCrewMembers = new ArrayList<>();
    }

    public void setPitCrewMembers(List<PitCrewMember> pitCrewMembers) {
        this.pitCrewMembers = pitCrewMembers;
    }

    public void performTask() {
        for (PitCrewMember member : pitCrewMembers) {
            member.performTask();
        }
    }
}