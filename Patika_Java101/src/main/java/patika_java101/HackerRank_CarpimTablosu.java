package patika_java101;  

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class HackerRank_CarpimTablosu {
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        System.out.println("Number :" );
        int num = input.nextInt();
        int i;
        for(i=1; i<=10; i++) {
           System.out.println(num+ " x "+ i + " = " + (num*i));
        }
    }
}


