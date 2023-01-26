import java.util.HashMap;
import java.util.Map;
class Scrabble {
    private String word;
    private static final Map <Integer, Integer> lscore = new HashMap<>(26);
    static{
        "aeioulnrst".chars().forEach(c ->  lscore.put(c,1));
        "dg".chars().forEach(c-> lscore.put(c,2));
        "bcmp".chars().forEach(c-> lscore.put(c,3));
        "fhvwy".chars().forEach(c-> lscore.put(c,4));
        "k".chars().forEach(c-> lscore.put(c,5));
        "jx".chars().forEach(c-> lscore.put(c,8));
        "qz".chars().forEach(c-> lscore.put(c,10));
    }

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {   
        return word.chars().reduce(0, (a,b)-> a + lscore.get(b));
    }

}
