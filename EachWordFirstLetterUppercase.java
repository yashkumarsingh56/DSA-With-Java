package JAVA_DSA.basic.STRINGS;

public class EachWordFirstLetterUppercase {
    public static String touppercase(String word) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(word.charAt(0));
        sb.append(ch);
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == ' '){
                sb.append(word.charAt(i));
                i++;
                sb.append(Character.toUpperCase(word.charAt(i)));
            }else {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am yash";
        System.out.println(touppercase(str));
    }
}
