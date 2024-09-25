package ACCENTURE;

public class chngeletters {
    public static String change(String str){
        
        char charArr[] = str.toCharArray();
        for (int i=0;i<charArr.length;i++){
            if (charArr[i]=='a'){
                charArr[i] ='b';
            }
            else if (charArr[i]=='b'){
                charArr[i]= 'a';
            }
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(change(str));
    }
}
