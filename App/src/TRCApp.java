class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargoType;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            System.out.println("Attempting to assign " + cargo + " to " + shape + " bogie...");
            validateCargo(cargo);
            this.cargoType = cargo;
            System.out.println("Success: Cargo assigned.");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment validation process completed.");
        }
    }

    private void validateCargo(String cargo) {
        if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Unsafe Assignment: Petroleum cannot be carried in a Rectangular bogie.");
        }
    }
    public String getCargoType() {
        return cargoType;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        System.out.println();
        System.out.println("Program continues to run safely...");
    }
}