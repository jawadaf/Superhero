public class Superhero {

    private String secretIdentity;
    private String realName;
    private String superPower;
    private int yearCreated;
    private boolean isHuman;
    private int strength;

    public Superhero() {

    }
    public Superhero(String secretIdentity, String realName, String superPower, int yearCreated, boolean isHuman, int strength) {
        this.secretIdentity = secretIdentity;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    // Getter metode

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIsHuman() {
        return isHuman;
    }
    public int getStrength() {
        return strength;
    }


    // Setter metode

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setIsHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "secretIdentity='" + secretIdentity + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreated=" + yearCreated +
                ", isHuman='" + isHuman + '\'' +
                ", strength=" + strength +
                '}';
    }
}
