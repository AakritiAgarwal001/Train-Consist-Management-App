import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String id;
    private int capacity;

    public Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class PerformanceComparison {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("B" + i, (int) (Math.random() * 100)));
        }

        long startTimeLoop = System.nanoTime();
        List<Bogie> filteredWithLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                filteredWithLoop.add(b);
            }
        }
        long endTimeLoop = System.nanoTime();
        long durationLoop = endTimeLoop - startTimeLoop;

        long startTimeStream = System.nanoTime();
        List<Bogie> filteredWithStream = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endTimeStream = System.nanoTime();
        long durationStream = endTimeStream - startTimeStream;

        System.out.println("Loop filtering time: " + durationLoop + " ns");
        System.out.println("Stream filtering time: " + durationStream + " ns");
        System.out.println("Results match: " + (filteredWithLoop.size() == filteredWithStream.size()));
    }
}
