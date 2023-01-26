import java.util.Arrays;

class Bob{
    
    public String hey (String input){
        input = input.trim();
        if (input.matches("(?!^[0-9\\W]+$)^[^a-z]+$") && input.endsWith("?")) return "Calm down, I know what I'm doing!";
        else if (input.endsWith("?")) return "Sure.";
        else if (input.matches("(?!^[0-9\\W]+$)^[^a-z]+$")) return "Whoa, chill out!";
        else if (input.isEmpty()) return "Fine. Be that way!"; 
        else return "Whatever.";
    }


    
}