class RaceDriver {
    private String name;

    public RaceDriver(String name) {
        this.name = name;
    }

    public void enterPitLane() {
        System.out.println(name + " is entering the pit lane.");
    }

    public void exitPitLane() {
        System.out.println(name + " is exiting the pit lane.");
    }
}
