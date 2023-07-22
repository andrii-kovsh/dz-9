package cc.robotdreams;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Man("Василь", "Чірт", 30);
        Person woman1 = new Woman("Іра", "Дика", 25);

        // Register partnership
        woman1.registerPartnership(man1);

        // Output details for Man
        System.out.println("Man Details:");
        System.out.println("First Name: " + man1.getFirstName());
        System.out.println("Last Name: " + man1.getLastName());
        System.out.println("Age: " + man1.getAge());
        if (man1 instanceof Man) {
            Man man1AsMan = (Man) man1;
            System.out.println("Партнер чоловіка: " + man1AsMan.getPartner());
        }
        System.out.println("Чи на пенсії: " + man1.isRetired());


        // Output details for Woman
        System.out.println("\nWoman Details:");
        System.out.println("First Name: " + woman1.getFirstName());
        System.out.println("Last Name: " + woman1.getLastName());
        System.out.println("Age: " + woman1.getAge());
        if (woman1 instanceof Woman) {
            Woman woman1AsWoman = (Woman) woman1;
            System.out.println("Партнер жінки: " + woman1AsWoman.getPartner());
        }

        System.out.println("Чи на пенсії: " + woman1.isRetired());
    }
}