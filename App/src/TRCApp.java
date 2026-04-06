import java.util.LinkedList;

public class TRCApp {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry Car");

        train.removeFirst();
        train.removeLast();

        System.out.println("Final ordered train consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}