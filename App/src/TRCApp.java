import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Capacity -> " + capacity;
    }
}

public class TRCApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("==========================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("==========================================\n");

        System.out.println("All Bogies:");
        bogies.forEach(b -> System.out.println(b.getType() + " -> " + b.getCapacity()));

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies:\n");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Bogie Type: " + type);
            list.forEach(System.out::println);
            System.out.println();
        });

        System.out.println("UC9 grouping completed...");
    }
}