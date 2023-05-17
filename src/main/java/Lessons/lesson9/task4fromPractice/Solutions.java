package Lessons.lesson9.task4fromPractice;

import java.util.*;

public class Solutions {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6);
        System.out.println();
        List<String> names = new ArrayList<>();

        System.out.println(removeDuplicates(listWithDuplicates));

        System.out.println("------------------");

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        System.out.println(set1);
        System.out.println(set2);


        System.out.println(intersection(set1,set2));


    }

    public static List<String> sort(List<String> strings){

        return new ArrayList<>(new TreeSet<>(strings));
    }

    public static List<Integer> removeDuplicates(List<Integer> listWithDuplicates) {
        Set<Integer> noDuplicates = new HashSet<>(listWithDuplicates);
        return new ArrayList<>(noDuplicates);

    }


    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
//        Set<Integer> result = new HashSet<>();
//        for (Integer number : set1) {
//            if (set2.contains(number)) {
//                result.add(number);
//
//            }
//        }
//        return result;
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

}
