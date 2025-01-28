public class Main {

    public static boolean canSpell(String tiles, String word) {
        int[] tileCounts = new int[26]; 
        
        for (char c : tiles.toCharArray()) {
            tileCounts[c - 'a']++;
        }
        
        for (char c : word.toCharArray()) {
            if (tileCounts[c - 'a'] == 0) {
                return false;
            }
            tileCounts[c - 'a']--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String tiles = "quijibo";
        String word = "jib";
        
        // Testando a função
        System.out.println(canSpell(tiles, word));  
        System.out.println(canSpell(tiles, "jibb")); 
        System.out.println(canSpell(tiles, "quiz")); 
        System.out.println(canSpell(tiles, "aaa"));  
    }
}
