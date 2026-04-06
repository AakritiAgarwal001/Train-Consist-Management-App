import java.util.ArrayList;

public class TRCApp {
    public static void main(String[] args) {
        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Current Train Consist: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Status: Sleeper bogie is attached to the train.");
        } else {
            System.out.println("Status: Sleeper bogie is not found.");
        }

        System.out.println("Final Train Consist: " + passengerBogies);
    }
}