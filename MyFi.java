

import java.util.InputMismatchException;
import java.util.Scanner;

 public class MyFi {
 private String name;

 public void setName(String name){
     this.name=name;
 }
 public String getName(){
     return name;
 }

     public static void main(String[] args) {
         MyFi o=new MyFi();
         o.setName("nnn");
         System.out.println(o.getName());
     }

 }



