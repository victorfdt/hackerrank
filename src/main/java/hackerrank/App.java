package hackerrank;

import hashmaps.RansomNoteSolution;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String[] magazine = new String[]{"give", "me", "one", "grand", "today", "night"};
        String[] note = new String[]{"give", "one", "grand", "today"};

        RansomNoteSolution solution = new RansomNoteSolution();

        solution.checkMagazine(magazine, note);
    }
}
