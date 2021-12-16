import java.util.Scanner;

public class RainbowClass {
    public static void main(String[] args) {
    chooseColor();

        }

    public static String chooseColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first color letter (B-bialy, Ż-Żółty, L-Limonkowy, F-Fioletowy):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    System.out.println("Biały");
                    break;
                case "Ż":
                    System.out.println("Żółty");
                    break;
                case "L":
                    System.out.println("Limonkowy");
                    break;
                case "F":
                    System.out.println("Fioletowy");
                    break;
                default:
                    System.out.println("Spróbuj jeszcze raz: (B - biały, Ż - żółty, L - limonkowy, F - fioletowy):");
            }
            return color;
        }
    }
}
