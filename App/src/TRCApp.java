import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        Pattern tPattern = Pattern.compile(trainIdPattern);
        Pattern cPattern = Pattern.compile(cargoCodePattern);

        System.out.print("Enter Train ID: ");
        String trainIdInput = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCodeInput = scanner.nextLine();

        Matcher tMatcher = tPattern.matcher(trainIdInput);
        Matcher cMatcher = cPattern.matcher(cargoCodeInput);

        if (tMatcher.matches()) {
            System.out.println("Train ID " + trainIdInput + " is valid.");
        } else {
            System.out.println("Invalid Train ID: " + trainIdInput + ". Format should be TRN-1234.");
        }

        if (cMatcher.matches()) {
            System.out.println("Cargo Code " + cargoCodeInput + " is valid.");
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCodeInput + ". Format should be PET-AB.");
        }

        scanner.close();
    }
}