package cc.robotdreams;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String previousLastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        if (partner instanceof Man) {
            this.partner = (Man) partner;
        } else if (partner instanceof Woman) {
            this.partner = (Woman) partner;
        }
    }
    public void registerPartnership(Person partner) {
        if (this.partner == null && partner != null && partner.getPartner() == null) {
            this.partner = partner;
            partner.setPartner(this);
        }
    }

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (this.partner != null) {
            this.partner = null;
            if (returnToPreviousLastName && this instanceof Woman) {
                this.setLastName(((Woman) this).getPreviousLastName());
            }
        }
    }
        public abstract boolean isRetired();{
    }
}