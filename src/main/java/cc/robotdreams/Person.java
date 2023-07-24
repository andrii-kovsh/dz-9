package cc.robotdreams;

public abstract class Person {
    private String firstName;
    protected String lastName;
    private String previousLastName;
    private int age;
    protected Person partner;

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
        this.partner = partner;
    }

    public abstract void registerPartnership(Person partner);

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (this.partner != null) {
            this.partner.setPartner(null); // Зняти партнерство у партнера
            this.partner = null; // Зняти партнерство у поточного об'єкта

            if (returnToPreviousLastName && previousLastName != null) {
                this.setLastName(previousLastName);
            }
        }
    }

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }
        public abstract boolean isRetired();
}