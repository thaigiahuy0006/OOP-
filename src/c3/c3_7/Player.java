package c3.c3_7;

public class Player {
    private int number;
    private float x, y, z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(x - ball.getX(), 2) + Math.pow(y - ball.getY(), 2));
        return distance < 1.0;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            ball.setXYZ(ball.getX() + 1, ball.getY() + 1, ball.getZ());
        }
    }

    public String toString() {
        return "Player " + number + " at (" + x + ", " + y + ", " + z + ")";
    }
}

