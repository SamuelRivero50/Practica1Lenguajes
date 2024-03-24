public class PitCrewMember {

    // Encapsulation
    // attributes are encapsulated
    private String name;
    private String role;

    public PitCrewMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void performTask() {
        System.out.println(name + " performing " + role + " task.");
    }
}