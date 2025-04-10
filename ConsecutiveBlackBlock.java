public class Main{
    public static void main(String[] args){
        String word = "WBBWWBBWBW";
        int k = 7; 
        System.out.println(ConsecutiveBlock(word,k));
    }
    public static int ConsecutiveBlock(String word,int k){
        int len = word.length();
        int value = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<k;i++){
            if(word.charAt(i) == 'W'){
                count++;
            }
        }
        value=count;
        for(int i=k;i<len;i++){
            if(word.charAt(i-k) == 'W'){
                count--;
            }
            if(word.charAt(i) == 'W'){
                count++;
            }
            value = Math.min(value,count);
        }
        return value;
    }
}