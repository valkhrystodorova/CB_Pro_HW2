package task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> families = new LinkedList<>();
        families.add("Moscow");
        families.add("Ivanovy");
        families.add("Kyiv");
        families.add("Petrovy");
        families.add("London");
        families.add("Abramovych");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < families.size(); i++) {
            if (input.equals(families.get(i))) {
                System.out.println(families.get(i + 1));
            }
        }
    }
}
