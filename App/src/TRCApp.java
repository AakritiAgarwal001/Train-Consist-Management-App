import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = bogies.stream()
                .allMatch(bogie -> {
                    if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                        return bogie.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });

        if (isSafe) {
            System.out.println("The train is safety compliant.");
        } else {
            System.out.println("Safety violation detected! The train is not safe.");
        }
    }
}