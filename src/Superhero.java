public class Superhero {

    private String secretIdentity;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private int strength;

    public Superhero(String secretIdentity, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        this.secretIdentity = secretIdentity;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }
    // Get
    public String getSecretIdentity() {
        return secretIdentity;
    }
    public String getRealName() {
        return realName;
    }
    public String getSuperPower() {
        return superPower;
    }

}
