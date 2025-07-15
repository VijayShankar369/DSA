class Solution {
    public boolean isValid(String word) {
        if(word == null || word.length() < 3){
            return false;
        }

        int vowels = 0;
        int consonants = 0;

        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;

            if(Character.isLetter(c)){
                char lower = Character.toLowerCase(c);
                if("aeiou".indexOf(lower) >= 0){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }

        return vowels > 0 && consonants > 0;

    }
}