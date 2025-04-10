import java.util.Stack;
public class Main{
    public static void main(String[] args){
        String p = "";
        System.out.println(checkParentheses(p));
    }
    public static boolean checkParentheses(String p){
        int len = p.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<len;i++){
            char single = p.charAt(i);
            if(single == '(' || single == '{' || single == '['){
                st.push(single);
            }
            else{
                if(st.isEmpty()){
                return false;
                }
                char top = st.pop();
                if((single == '(' && top != ')') ||
                  (single == '{' && top != '}') ||
                  (single == '[' && top != ']'))
                  return false; 
            }
        }
        return st.isEmpty();
    }
}