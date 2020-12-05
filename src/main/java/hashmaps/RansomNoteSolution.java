package hashmaps;

import java.util.HashMap;

public class RansomNoteSolution {
    public void checkMagazine(String[] magazine, String[] note) {
        var wordsToUse = new HashMap<String, Integer>();
        var wordsFromMagazine = new HashMap<String, Integer>();
        var outPut = "Yes";

        // Save the words that will be used and their quantity
        for (String word : note) {
            if (wordsToUse.get(word) == null) {
                wordsToUse.put(word, 1);
            } else {
                wordsToUse.put(word, wordsToUse.get(word) + 1);
            }
        }

        // Print the found words
        wordsToUse.forEach((key, value) -> {
            System.out.println("word: " + key + " qtd: " + value);
        });

        // Check if the magazine has all the required words
        for (String word : magazine) {
            if (wordsFromMagazine.get(word) == null) {
                wordsFromMagazine.put(word, 1);
            } else {
                wordsFromMagazine.put(word, wordsFromMagazine.get(word) + 1);
            }
        }

        // Compare the words from the note to the words from the magazine
        for (String key : wordsToUse.keySet()) {
            if (wordsFromMagazine.get(key) == null) {
                outPut = "No";
                break;
            } else {
                if (wordsFromMagazine.get(key) < wordsToUse.get(key)) {
                    outPut = "No";
                    break;
                }
            }
        }

        System.out.println(outPut);
    }
}
