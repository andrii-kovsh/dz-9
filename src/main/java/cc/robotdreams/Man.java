package cc.robotdreams;

public class Man extends Person {
    private Woman partner;

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.partner = null;
    }

    public Woman getPartner() {
        return partner;
    }

    public Woman registerPartnership(Woman partner) {
        this.partner = partner;
        partner.setPartner(this);
        return partner;
    }

    public void deregisterPartnership() {
        if (partner != null) {
            partner.setLastName(partner.getLastName());
            this.partner = null;
        }
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 65;
    }
}