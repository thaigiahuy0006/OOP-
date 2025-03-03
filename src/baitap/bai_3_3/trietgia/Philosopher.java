package baitap.bai_3_3.trietgia;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    private int id;
    private Semaphore chopstick; // Đũa của triết gia này
    private Philosopher leftNeighbor; // Hàng xóm bên trái

    public Philosopher(int id, Semaphore chopstick) {
        this.id = id;
        this.chopstick = chopstick;
    }

    public void setLeftNeighbor(Philosopher leftNeighbor) {
        this.leftNeighbor = leftNeighbor;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) { // Mỗi triết gia ăn 3 lần
                think();
                eat();
                passChopstick();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Triết gia " + id + " đang nghĩ cách cướp đũa.");
        Thread.sleep(1000);
    }

    private void eat() throws InterruptedException {
        chopstick.acquire(); // Lấy đũa để ăn
        System.out.println("Triết gia " + id + " đang tận hưởng bửa ăn.");
        Thread.sleep(2000);
    }

    private void passChopstick() {
        System.out.println("Triết gia " + id + " đã no và chuyển đũa cho người tiếp theo " + leftNeighbor.id + ".");
        leftNeighbor.chopstick.release(); // Chuyền đũa cho hàng xóm
    }
}

