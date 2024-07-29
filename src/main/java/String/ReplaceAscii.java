package String;

// increase ascii value in even index and decrease on odd index
public class ReplaceAscii {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("DarshanTrivedi");
        StringBuilder s = new StringBuilder("bcde");
        for(int i = 0; i < s.length(); i++){
            if(i%2 == 0){
                s.setCharAt(i, (char) (s.charAt(i) + 1));
            }else {
                s.setCharAt(i, (char) (s.charAt(i) - 1));
            }
        }
        System.out.println(s);
    }
}
