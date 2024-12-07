package collectionframework;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isbalanced(s));
    }
    public static boolean pair(char c1 , char c2){
        if (c1 == '(' && c2 == ')')return true;
        if (c1 == '{' && c2 == '}')return true;
        if (c1 == '[' && c2 == ']')return true;
        return false;
    }
    public static boolean isbalanced(String s){
        Stack<Character>st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '[' || a == '{' || a == '(')
                st.push(a);
            else if (a == '}' || a == ']' || a == ')'){
                if (st.isEmpty() || !pair(st.pop(),a))
                    return false;
            }
        }
        return st.isEmpty();
    }
}
