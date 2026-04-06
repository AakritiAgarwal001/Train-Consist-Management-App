import java.util.HashSet;
import java.util.Set;

public class TRCApp {
    public static void main(String[] args) {
        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");

        System.out.println("Unique Bogie IDs in the Train Consist:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}