public class TyreGunner extends PitCrewMember {
    public TyreGunner(String name) {
        super(name, "Tyre Gunner");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" task.");
    }
}