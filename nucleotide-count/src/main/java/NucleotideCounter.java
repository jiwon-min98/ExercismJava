
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.Arrays;

class NucleotideCounter{

    Map<Character, Integer> counter = new HashMap<>();

    NucleotideCounter(String sequence){
        if( Pattern.compile("[^ACGT]+").matcher(sequence).find()){
            throw new IllegalArgumentException();
        }
        for (char item: Arrays.asList('A', 'C', 'G', 'T')) {
            counter.put(item, 0);
        }

        for (char e : sequence.toUpperCase().toCharArray()){
            int currentVal = this.counter.get(e);
            this.counter.put(e, currentVal+1);
        }  
    }

    public Map<Character, Integer> nucleotideCounts(){
        return this.counter;
    }






}