package ACCENTURE;

public class Anagram {
    public Anagram() {
    }

    public static boolean isAnagram(String S, String T) {
        if (S.length() != T.length()) {
            return false;
        } else {
            int[] arr = new int[26];

            int i;
            for(i = 0; i < S.length(); ++i) {
                ++arr[S.charAt(i) - 97];
                --arr[T.charAt(i) - 97];
            }

            for(i = 0; i < 26; ++i) {
                if (arr[i] != 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        String S = "yaash";
        String T = "aashy";
        System.out.println(isAnagram(S, T));
    }
}