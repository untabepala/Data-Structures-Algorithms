import java.io.*;
import java.util.*;
class stackImple{
    //pushing element
    static void stackpush(Stack<Integer>stack){
        for (int i=0;i<5;i++){
            stack.push(i);
        }
    }
    //popping element
    static void stackpop(Stack<Integer>stack){
        for (int i=0;i<5;i++){
            Integer y=(Integer) stack.pop();
            System.out.println(y);
        }
    }
    //displaying elements
    static void stackpeek(Stack<Integer>stack){
        Integer ele=(Integer) stack.peek();
        System.out.println(ele);
    }
    //searching ele
    static void stacksearch(Stack<Integer>stack,int ele){
        Integer pos=(Integer)stack.search(ele);
        if(pos==-1){
            System.out.println("Not Found");
        }else{
            System.out.println(pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<Integer>();
        stackpush(stack);
        stackpop(stack);
        stackpeek(stack);
        stacksearch(stack,2);
    }
}
