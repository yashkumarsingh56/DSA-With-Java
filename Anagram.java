package ACCENTURE;

public class Anagram {
    public static boolean isAnagram(String S,String T){
        if (S.length()!=T.length()){
            return false;
        }
        int arr[] = new int[26];
        for (int i=0;i<S.length();i++){
            arr[S.charAt(i)-'a']++;
            arr[T.charAt(i)-'a']--;
        }
        for (int i=0; i<26;i++){
            if (arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String S = "yaash";
        String T = "aashy";
        System.out.println(isAnagram(S,T));
    }
}
