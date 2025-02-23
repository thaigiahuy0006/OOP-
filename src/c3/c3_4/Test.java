package c3.c3_4;

public class Test {
    public static void main(String[] args) {

        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(23, 59, 59);

        System.out.println("Initial time1: " + time1); // 00:00:00
        System.out.println("Initial time2: " + time2); // 23:59:59

        time1.setTime(12, 30, 45);
        System.out.println("Set time1: " + time1); // 12:30:45

        time1.nextSecond();
        System.out.println("After nextSecond: " + time1); // 12:30:46
        time1.nextMinute();
        System.out.println("After nextMinute: " + time1); // 12:31:46
        time1.nextHour();
        System.out.println("After nextHour: " + time1); // 13:31:46

        time2.previousSecond();
        System.out.println("After previousSecond: " + time2); // 23:59:58
        time2.previousMinute();
        System.out.println("After previousMinute: " + time2); // 23:58:58
        time2.previousHour();
        System.out.println("After previousHour: " + time2);
    }
}
