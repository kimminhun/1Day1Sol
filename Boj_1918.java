package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Boj_1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int s=str.length();
        StringBuilder sb=new StringBuilder();
        Stack<Character> stk=new Stack<>();

        HashMap<Character,Integer> map=new HashMap<>();
        map.put('(',0);
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);

        for (int i=0;i<s;i++){
            char c=str.charAt(i);
            if(c>='A'&&c<='Z'){
                sb.append(c);
            }else{
                switch (c){
                    case '(':
                        stk.push(c);
                        break;
                    case ')':
                        while(!stk.isEmpty()&&stk.peek()!='('){
                            sb.append(stk.pop());
                        }
                        if(!stk.isEmpty()&&stk.peek()=='('){
                            stk.pop();
                        }
                        break;
                    default:
                        while(!stk.isEmpty()&&map.get(stk.peek())>=map.get(c)){
                            sb.append(stk.pop());
                        }
                        stk.push(c);
                }

            }
        }

        while (!stk.isEmpty()) sb.append(stk.pop());

        System.out.println(sb.toString());

    }
}
