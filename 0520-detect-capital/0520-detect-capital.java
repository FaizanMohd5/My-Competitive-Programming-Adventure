class Solution {
    public boolean detectCapitalUse(String word) {
        
        // input string shorter than 2 characters
        if (word.length() < 2) return true;
        
        // all characters are uppercase
        if (word.toUpperCase().equals(word)) return true;
        
        // all characters after the first are lowercase
        if (word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        
        return false;
            
    }
}