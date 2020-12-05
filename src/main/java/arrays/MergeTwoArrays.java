package arrays;

import java.util.HashSet;

public class MergeTwoArrays {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        var uniqueNames = new HashSet<String>();

        for (String name : names1) {
            uniqueNames.add(name);
        }


        for (String name : names2) {
            uniqueNames.add(name);
        }

        return uniqueNames.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeTwoArrays.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
