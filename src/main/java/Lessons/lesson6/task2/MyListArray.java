package Lessons.lesson6.task2;

public class MyListArray {
    private int size = 0;
    private String[] list = new String[10];

    public void add(String str, int index) {
        list[index] = str;
    }

    public void add(String str){
        list[size++] = str;




    }
}
