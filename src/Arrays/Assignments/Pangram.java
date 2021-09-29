package Arrays.Assignments;

public class Pangram {
    public static void main(String[] args) {
    String s = "thequickbrownfoxjumpsoverthelazydog";
    boolean ans = checkIfPangram(s);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence) {
        String s = sentence;
        for(char c='a';c<='z';c++){
            if(!s.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}
