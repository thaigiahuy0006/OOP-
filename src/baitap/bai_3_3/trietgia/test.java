package baitap.bai_3_3.trietgia;

import java.util.concurrent.Semaphore;

public class test {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Semaphore[] chopsticks = new Semaphore[numPhilosophers + 1];

        // Tạo mỗi đũa là một Semaphore
        for (int i = 1; i <= numPhilosophers; i++) {
            chopsticks[i] = new Semaphore(1);
        }

        // Tạo danh sách triết gia
        Philosopher[] philosophers = new Philosopher[numPhilosophers + 1];
        Thread[] threads = new Thread[numPhilosophers + 1];

        for (int i = 1; i <= numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i]);
        }

        // Gán hàng xóm bên trái
        for (int i = 1; i <= numPhilosophers; i++) {
            philosophers[i].setLeftNeighbor(philosophers[(i % numPhilosophers) + 1]);
        }

        // Chỉ triết gia đầu tiên có đũa ban đầu
        try {
            chopsticks[1].acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Tạo và khởi chạy các thread
        for (int i = 1; i <= numPhilosophers; i++) {
            threads[i] = new Thread(philosophers[i]);
            threads[i].start();
        }

        // Đợi tất cả thread kết thúc
        for (int i = 1; i <= numPhilosophers; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
