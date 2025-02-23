package c3.c3_4;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (second == 59) {
            second = 0;
            return nextMinute();
        }
        second++;
        return this;
    }

    public MyTime nextMinute() {
        if (minute == 59) {
            minute = 0;
            return nextHour();
        }
        minute++;
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            hour = 0;
        } else {
            hour++;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second == 0) {
            second = 59;
            return previousMinute();
        }
        second--;
        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            minute = 59;
            return previousHour();
        }
        minute--;
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            hour = 23;
        } else {
            hour--;
        }
        return this;
    }
}
