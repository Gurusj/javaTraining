public class Reversestring {
    public static void main(String[] args) {
        String s = "AMANTYA";
        for (int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}