class F1Team {
    private String name;
    private int yearEstablished;

    public F1Team(String name, int yearEstablished) {
        this.name = name;
        this.yearEstablished = yearEstablished;
    }

    public void introduceTeam() {
        System.out.printf("Welcome to %s F1 Team, established in %d!\n", name, yearEstablished);
    }
}
