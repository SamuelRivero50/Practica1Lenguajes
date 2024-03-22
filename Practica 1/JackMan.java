class JackMan extends PitCrewMember {

    public JackMan(String name) {
        super(name, "Jackman");
    }

    @Override
    public void performTask() {
        System.out.println(this + " is lifting the car with the jacks.");
    }
}