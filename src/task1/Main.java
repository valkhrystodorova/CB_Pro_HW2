package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> values = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        while (!value.equals("end")){
                values.add(value);
           value = sc.nextLine();
        }
        System.out.println(values);

    }
}
