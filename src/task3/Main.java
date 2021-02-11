package task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> list = getIntegerList(sc, number);
        System.out.println(list);

        System.out.println(getMinimum(list));
    }

    private static List<Integer> getIntegerList(Scanner sc, int number) {
        List<Integer> list = new LinkedList<>();
        int value;
        for (int i = 0; i < number; i++) {
            value = sc.nextInt();
            list.add(value);
        }
        return list;
    }

    private static Integer getMinimum(List<Integer> list) {
        int minValue = Integer.MAX_VALUE;
        for (Integer listvalue : list) {
            if (listvalue < minValue){
                minValue = listvalue;
            }
        }
        return minValue;
    }

}
