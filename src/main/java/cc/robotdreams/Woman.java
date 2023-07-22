package cc.robotdreams;

public class Woman extends Person {
    private Man partner;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.partner = null;
    }

    public Man getPartner() {
        return partner;
    }

    public void registerPartnership(Man partner) {
        this.partner = partner;
        partner.setPartner(this);
    }

    public void deregisterPartnership() {
        if (partner != null) {
            setLastName(getLastName());
            this.partner = null;
        }
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }
}