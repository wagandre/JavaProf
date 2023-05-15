package Lessons.lesson3.task1;

public class Test {
    public static void main(String[] args) {


        Day day = Day.FRIDAY;

        switch(day) {
            case MONDAY :
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday");
                break;
            case THURSDAY:
                System.out.println("It's Thursday");
                break;
            case FRIDAY:
                System.out.println("It's Friday");
                break;
            case SATURDAY:
                System.out.println("It's Saturday");
                break;
            case SUNDAY :
                System.out.println("It's Sunday");
                break;

        }
//Day day4 = day.valueOf("WEDNESDAY");
//        System.out.println(day4);
        Day[] days = Day.values();

//        for (int i = 0; i < days.length; i++) {
//            System.out.println(days[i]);
//
//        }

        for(Day allDays: days ){
            System.out.println(allDays);
        }


    }
}