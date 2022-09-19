import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] words = {"nul", "één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};
        boolean play = true;
        String invalid = "Ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        Translator translator = new Translator(numbers, words);

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int inputNumber = scanner.nextInt();
                scanner.nextLine();
                if (inputNumber <= 10) {
                    String output = translator.translate(inputNumber);
                    System.out.println("De vertaling van " + inputNumber + " is " + output);
                }
                else {
                    System.out.println(invalid);
                }
            }
            else {
                System.out.println(invalid);
            }
        }
    }
}
