import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name : ");
        String name = scanner.nextLine();
        System.out.println("Enter a noun : ");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb : ");
        String verb = scanner.nextLine();
        System.out.println("Enter a pronoun : ");
        String pronoun = scanner.nextLine();
        System.out.println("Enter a adjective : ");
        String adjective = scanner.nextLine();
        System.out.println("Enter age : ");
        int age = scanner.nextLine();
        System.out.println("Enter floating point number : ");
        float fn = scanner.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Noun : " + noun);
        System.out.println("Verb : " + verb);
        System.out.println("Pronoun : " + pronoun);
        System.out.println("Adjective : " + adjective);
        System.out.println("Age : " + age);
        System.out.println("Float number : " + fn);

        scanner.close();
    }
}
