import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int inputNumber = 0;
        Boolean checkNumber = false;
        String inputName = "X";

        Scanner scnr1 = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in);

        // Get user's name
        System.out.println("Enter your name:");
        inputName = scnr1.nextLine();
        System.out.println("Your name is: " + inputName);

        System.out.println("Do you want run Lab Number 2? Enter Y or N");
        String answer = scnr1.nextLine();
        System.out.println("answer = " + answer);

        while (answer.equalsIgnoreCase("Y")) {

            while (checkNumber == false) {
                System.out.println(inputName + " - Enter a number between 1 - 100");
                inputNumber = scnr2.nextInt();
                System.out.println("Number Input is: " + inputNumber);

                if (inputNumber >= 1 & inputNumber <= 100) {
                    checkNumber = true;
                    break;
                } else {
                    System.out.println(inputName + " - Number is not within valid range of 1 - 100");

                }
            }
            // Determine if number is Odd
            if ((inputNumber % 2 != 0) & (inputNumber <= 60)) {
                System.out.println(inputName + " - Odd number is: " + inputNumber);
            }
            // Number is even
            else if ((inputNumber % 2 == 0) & ((inputNumber >= 2) & (inputNumber <= 25))) {
                System.out.println(inputName + " - Even and less than 25.");
            } else if ((inputNumber % 2 == 0) & ((inputNumber >= 26) & (inputNumber <= 60))) {
                System.out.println(inputName + " - Even.");
            } else if ((inputNumber % 2 == 0) & ((inputNumber >= 60))) {
                System.out.println(inputName + " - " + inputNumber + " Even.");
            } else if ((inputNumber % 2 != 0) & ((inputNumber > 60))) {
                System.out.println(inputName + " -  " + inputNumber + " Odd");
            }

            System.out.print("Do you want run Lab Number 2? Enter Y or N");
            answer = scnr1.nextLine();
            checkNumber = false;
            System.out.println("answer = " + answer);
        }
    }
 }


