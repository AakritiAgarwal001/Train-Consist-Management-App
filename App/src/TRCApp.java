import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TRCApp {
    public static void main(String[] args) {
        testTotalCapacity();
        testEmptyList();
    }

    public static void testTotalCapacity() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("General", 90)
        );

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        if (totalSeats == 218) {
            System.out.println("testTotalCapacity: PASSED");
        } else {
            System.out.println("testTotalCapacity: FAILED (Expected 218, got " + totalSeats + ")");
        }
    }

    public static void testEmptyList() {
        List<Bogie> emptyBogies = Arrays.asList();

        int totalSeats = emptyBogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        if (totalSeats == 0) {
            System.out.println("testEmptyList: PASSED");
        } else {
            System.out.println("testEmptyList: FAILED");
        }
    }
}