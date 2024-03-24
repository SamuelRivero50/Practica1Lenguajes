class TyreGunnerTeamB extends PitCrewMember {
    public TyreGunnerTeamB(String name) {
        super(name, "Tyre Gunner for Team B");
    }

    public void performTask() {
        System.out.println("Performing task: "+getName()+" for Team B");
    }
}