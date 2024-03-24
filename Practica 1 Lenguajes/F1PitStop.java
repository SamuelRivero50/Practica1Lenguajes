import java.util.ArrayList;
import java.util.List;

public class F1PitStop {

    public static void main(String[] args) {

        F1Team eafunF1Team = new F1Team("Eafun's F1 Team", 2020);
        PitCrewTeam pitCrewTeam = eafunF1Team.getPitCrewTeam();
        TeamDriverA teamDriverA = eafunF1Team.getTeamDriverA();
        TeamDriverB teamDriverB = eafunF1Team.getTeamDriverB();

        List<PitCrewMember> pitCrewMembers = new ArrayList<>();

        // Adding 5 exclusive members for Team A
        pitCrewMembers.add(new TyreGunnerTeamA("Tyre Gunner A 1"));
        pitCrewMembers.add(new TyreGunnerTeamA("Tyre Gunner A 2"));
        pitCrewMembers.add(new TyreOffTeamA("TyreOff A 1"));
        pitCrewMembers.add(new TyreOffTeamA("TyreOff A 2"));
        pitCrewMembers.add(new TyreOnTeamA("Tyre On A 1"));

        // Adding 5 exclusive members for Team B
        pitCrewMembers.add(new TyreGunnerTeamB("Tyre Gunner B 1"));
        pitCrewMembers.add(new TyreGunnerTeamB("Tyre Gunner B 2"));
        pitCrewMembers.add(new TyreOffTeamB("Tyre Off B 1"));
        pitCrewMembers.add(new TyreOffTeamB("Tyre Off B 2"));
        pitCrewMembers.add(new TyreOnTeamB("Tyre On B 1"));

        //General members
        pitCrewMembers.add(new TyreGunner("Tyre Gunner 1"));
        pitCrewMembers.add(new TyreGunner("Tyre Gunner 2"));
        pitCrewMembers.add(new TyreOff("Tyre Off 1"));
        pitCrewMembers.add(new TyreOff("Tyre Off 2"));
        pitCrewMembers.add(new TyreOn("Tyre On 1"));
        pitCrewMembers.add(new TyreOn("Tyre On 2"));
        pitCrewMembers.add(new TyreOn("Tyre On 3"));
        pitCrewMembers.add(new FrontJack("Front Jack 1"));
        pitCrewMembers.add(new FrontJack("Front Jack 2"));
        pitCrewMembers.add(new RearJack("Rear Jack 1"));
        pitCrewMembers.add(new RearJack("Rear Jack 2"));
        pitCrewMembers.add(new Steadier("Steadier 1"));
        pitCrewMembers.add(new Steadier("Steadier 2"));
        pitCrewMembers.add(new FrontWingFlapAdjust("Front Wing Adjust 1"));
        pitCrewMembers.add(new FrontWingFlapAdjust("Front Wing Adjust 2"));
        pitCrewMembers.add(new LollipopMan("Lollipop Man 1"));


        pitCrewTeam.setPitCrewMembers(pitCrewMembers);
        teamDriverA.setPitCrewTeam(pitCrewTeam);
        teamDriverB.setPitCrewTeam(pitCrewTeam);

        // Assuming that performTask method exists for TeamDriverA and TeamDriverB

        System.out.println("Driver A enters the pit stop\n");
        teamDriverA.performTask();
        System.out.println("");
        System.out.println("Driver A leaves the pit stop \n");
        System.out.println("Driver B enters the pit stop \n");
        teamDriverB.performTask();
        System.out.println("");
        System.out.println("Driver B leaves the pit stop\n");
    }
}