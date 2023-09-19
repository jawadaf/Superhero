import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Superhero superhero = new Superhero();
        Scanner scan = new Scanner(System.in);

        System.out.println("press 1 if you want to create a superhero");
        System.out.println("press 2 if you want to exit the program");

        int UserInput = scan.nextInt();

        if (UserInput == 1) {
            System.out.println("Enter your superhero secretIdentity");
            String userSecretIdentity = scan.next();
            superhero.setSecretIdentity(userSecretIdentity);


            System.out.println("What your superhero's real name to be?");
            String userRealName = scan.next();
            superhero.setRealName(userRealName);


            System.out.println("What is your superhero's superpower to be?");
            String userSuperPower = scan.next();
            superhero.setSuperPower(userSuperPower);


            System.out.println("What year your superhero created?");
            int userYearCreated = scan.nextInt();
            superhero.setYearCreated(userYearCreated);


            System.out.println("Is your superhero a human or not");
            boolean userIsHuman = scan.nextBoolean();
            superhero.setIsHuman(userIsHuman);


            System.out.println("What do you want your Superhero strength to be?");
            int userStrength = scan.nextInt();
            superhero.setStrength(userStrength);


        } else if (UserInput == 2) {
            System.out.println("exit");
        }


    }
}
