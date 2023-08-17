package SummaryJava.summary7.Example1;

import java.util.ArrayList;

public class OutOfMemoryExample {
    public static void main(String[] args) {


        OutOfMemoryExample no = new OutOfMemoryExample();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        int count = 0;

        while(true){

            count++;
        }
    }
    String [] newStringArray(){
        String[] newArray = new String[1_000_000];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = "feefwefwefwefewfewfwef";


        }
        return newArray;

    }
}