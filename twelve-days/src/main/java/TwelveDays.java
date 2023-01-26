class TwelveDays {
    private String[] days = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    String[] gifts = {"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings",
			"six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking",
			"nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming" };


    String verse(int verseNumber) {
        StringBuilder allTheGifts = new StringBuilder();
        if(verseNumber > 1) {
            for(int i = verseNumber - 1; i >= 0; i--) {
                allTheGifts.append(i != 0 ? gifts[i] + ", " : "and " + gifts[i]);
            }
        }
        else {
            allTheGifts.append(gifts[verseNumber - 1]);
        }
        String verseStr = String.format("On the %s day of Christmas my true love gave to me: %s.\n", days[verseNumber - 1], allTheGifts.toString());
        return verseStr;
    }

    String verses(int startVerse, int endVerse) {
        String res = new String();
        for(int i = startVerse; i <= endVerse; i++){
            if(i == endVerse) res += verse(i);
            else res += verse(i) + "\n";
        }
        return res;
    }
    
    String sing() {
        return verses(1,12);
    }
}
