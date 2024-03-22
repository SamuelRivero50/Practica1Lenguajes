class WheelChanger extends PitCrewMember {
  private String side;

  public WheelChanger(String name, String side) {
    super(name, "Wheel Changer (" + side + ")");
    this.side = side;
  }

  @Override
  public void performTask() {
    System.out.println(this + " is removing and replacing the " + side + " wheel.");
  }
}
