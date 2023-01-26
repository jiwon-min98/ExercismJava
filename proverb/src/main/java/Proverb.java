class Proverb {
    private String[] m_words;
    private static final String genericPhrase = "For want of a %s the %s was lost.\n";
    private static final String finalPhrase = "And all for the want of a %s.";

    Proverb(String[] words) {
        m_words = words;     
    }

    String recite() {
        String proverb = "";

        for (int i = 0; i < m_words.length - 1; ++i){
            proverb += String.format(genericPhrase, m_words[i], m_words[i + 1]);
        }
        if (m_words.length > 0){
            proverb += String.format(finalPhrase, m_words[0]);
        }
        return proverb;
    }

}
