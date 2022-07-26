import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnglishManager englishManager = new EnglishManager();
        CyrillicManager cyrillicManager = new CyrillicManager();

        while (true) {
            int action = showMenuGetAction();
            switch (action) {
                case 1:
                    englishManager.star();
                    break;
                case 2:
                    cyrillicManager.star();
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        }

    }

    public static int showMenuGetAction() {
        System.out.println("\n\t***Converter***");
        System.out.println("-------------------------");
        System.out.println("| 1-English to Russian\t|");
        System.out.println("| 2-Russian to English  |");
        System.out.println("| 0-Exit\t\t\t\t|");
        System.out.println("-------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter action: ");
        String num = scanner.next();
        for (char s : num.toCharArray()) {
            if (!Character.isDigit(s)) {
                System.out.println("Please Enter number");
                return -1;
            }

        }
        return Integer.parseInt(num);
    }
}
