package com.balancedbrackets;

import java.util.*;

public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
      int l= expression.length();
      if(l%2!=0)
          return false;
      Stack <Character> myStack = new Stack<Character>();
      for(int i=0;i<l;i++){
          if(expression.charAt(i)=='[' || expression.charAt(i)=='{' ||expression.charAt(i)=='(') {
              myStack.push(expression.charAt(i));
              System.out.println("opening char");
              System.out.println(expression.charAt(i));
          }
          else if(myStack.empty())   {
        	  System.out.println("empty");
              return false;
          }
          else {
              char temp=myStack.pop();
              System.out.println("closing char");
              System.out.println("temp:"+ temp);
              System.out.println("current char:"+ expression.charAt(i));
              if(!((expression.charAt(i)==']' && temp=='[') || (expression.charAt(i)=='}' && temp=='{')||(expression.charAt(i)==')'&& temp=='(')))
                  return false;
          }
      }
      if(myStack.isEmpty())  
    	  return true;
      else
    	  return false;
     }
  
public static void main(String[] args) {
           String expression = "[[]]";
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
    }
}

