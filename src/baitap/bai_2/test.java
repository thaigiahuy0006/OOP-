package baitap.bai_2;

public class test {
    public static void main(String[] args) {
        datve bookingSystem = new datve(10);

        Thread agent1 = new cuahang(bookingSystem, "Agent 1");
        Thread agent2 = new cuahang(bookingSystem, "Agent 2");
        Thread agent3 = new cuahang(bookingSystem, "Agent 3");

        agent1.start();
        agent2.start();
        agent3.start();
    }
}
