package example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.*;

public class One {
    String message = "foo";

    public String foo() {
        return message;
    }

    public void uncoveredMethod() {
        System.out.println(foo());
    }

    public static void main (String[] args)  throws IOException {
        if (args[0].equals("consume")) {
            List letterList = new ArrayList();
            List digitList = new ArrayList();
            List otherList = new ArrayList();
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(System.in));
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                    char[] lineToArray = line.toCharArray();
                    for(char c : lineToArray){
                        if(isLetter(c)){
                            letterList.add(c);
                        }else if(isDigit(c)){
                            digitList.add(c);
                        }else {
                            otherList.add(c);
                        }
                    }
                    System.out.println("letters : "+letterList.toString());
                    System.out.println("digits : "+digitList.toString());
                    System.out.println("others : "+otherList.toString());
                    letterList.clear();
                    digitList.clear();
                    otherList.clear();
                }
            }
            catch (IOException e) {
                throw e;
            }
            finally {
                if (in != null) {
                    in.close();
                }
            }
        } else {
            List letterList = new ArrayList();
            List digitList = new ArrayList();
            List otherList = new ArrayList();
            for (String s: args) {
//                System.out.println(s);
                char[] sToArray = s.toCharArray();
                for(char c : sToArray){
                    if(isLetter(c)){
                        letterList.add(c);
                    }else if(isDigit(c)){
                        digitList.add(c);
                    }else {
                        otherList.add(c);
                    }
                }
            }
            System.out.println("letters : "+letterList.toString());
            System.out.println("digits : "+digitList.toString());
            System.out.println("others : "+otherList.toString());
            letterList.clear();
            digitList.clear();
            otherList.clear();
        }

    }
}