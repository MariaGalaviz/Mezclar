import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
    public static List<Integer> parseList(String input) {
        List<Integer> list = new ArrayList<>();
        String[] parts = input.split(",\\s*");
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, proporciona dos listas de números como argumentos.");
            return;
        }

        List<Integer> list1 = parseList(args[0]);
        List<Integer> list2 = parseList(args[1]);

        List<Integer> mergedList = merge(list1, list2);
        System.out.println(mergedList);
    }
}