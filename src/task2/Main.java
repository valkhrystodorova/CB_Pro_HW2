package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String value;
        for (int i = 0; i < 5; i++) {
            value = scanner.next();
            values.add(value);
        }
        List<String> newValues = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            newValues.add(values.get(i));
            newValues.add(values.get(i));

        }
        for (int i = 0; i < newValues.size(); i++) {
            System.out.println(newValues.get(i));
        }
    }
}
