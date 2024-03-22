abstract class PitCrewMember {
  private String name;
  private String role;

  public PitCrewMember(String name, String role) {
    this.name = name;
    this.role = role;
  }

  public abstract void performTask();

  @Override
  public String toString() {
    return name + " (" + role + ")";
  }
}