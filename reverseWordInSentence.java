package JAVA_DSA.basic.STRINGS;

public class reverseWordInSentence {
    public static void main(String[] args) {
        String str="akhil is a good Boy";
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                // sb.delete(0,sb.length());
                sb=new StringBuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}

