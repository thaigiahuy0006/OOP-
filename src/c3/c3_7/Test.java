package c3.c3_7;

public class Test {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0f, 0.0f, 0.0f);
        System.out.println("Vị trí ban đầu của bóng: " + ball);

        Player player1 = new Player(10, 0.5f, 0.5f);
        System.out.println("Vị trí ban đầu của cầu thủ: " + player1);

        player1.kick(ball);
        System.out.println("Vị trí của bóng sau khi đá: " + ball);

        player1.move(1.0f, 1.0f);
        System.out.println("Vị trí của cầu thủ sau khi di chuyển: " + player1);

        player1.jump(2.0f);
        System.out.println("Vị trí của cầu thủ sau khi nhảy: " + player1);
    }
}


