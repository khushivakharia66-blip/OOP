class Time {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        if (minutes >= 60) {
            minutes = minutes - 60;
            hours = hours + 1;
        }
    }

    void displayTime() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.setTime(2, 45);
        t2.setTime(1, 30);

        t3.addTime(t1, t2);

        System.out.print("First ");
        t1.displayTime();

        System.out.print("Second ");
        t2.displayTime();

        System.out.print("Added ");
        t3.displayTime();
    }
}
