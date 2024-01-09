import java.util.*;
import java.io.*;
public class stackAccessingElement {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.push("welcome");
        st.push("to");
        st.push("class");
        System.out.println(st);
        System.out.println("top element: "+st.peek());
        System.out.println("final stack:"+st);
    }


    }


