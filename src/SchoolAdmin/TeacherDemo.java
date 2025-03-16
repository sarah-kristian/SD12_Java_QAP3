package SchoolAdmin;

public class TeacherDemo {
    public static void main(String[] args) {

        Person rosie = new Person("Rosie", 28, "F");
        Student rosha = new Student("Rosha Brooke", 10, "N", "HS95129", 3.5);
        Teacher jeff = new Teacher("Jeff Java", 50, "M", "Computer Science", 50000);
        CollegeStudent soren = new CollegeStudent("Soren Skillz", 18, "M", "UCB123", 4.0, 1, "English");

        //display output
        System.out.println("Meet the team:");
        System.out.println(rosie);
        System.out.println(rosha);
        System.out.println(jeff);
        System.out.println(soren);
    }
}