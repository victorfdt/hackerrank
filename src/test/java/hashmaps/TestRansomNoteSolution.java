package hashmaps;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestRansomNoteSolution {

    private RansomNoteSolution solution = new RansomNoteSolution();
    private static String[] magazine;
    private static String[] note;

    @BeforeAll
    static void init() {
        magazine = new String[]{"give", "me", "one", "grand", "today", "night"};
        note = new String[]{"give", "one", "grand", "today"};
    }

    @Test
    void validate() {
        solution.checkMagazine(magazine, note);
    }
}
