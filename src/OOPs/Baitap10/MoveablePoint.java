package OOPs.Baitap10;

public class MoveablePoint implements Moveable {
    private static int x;
    private static int y;
    private static int xSpeed;
    private static int ySpeed;
    public MoveablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        this.y -= this.ySpeed ;
    }
    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }
    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }
    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getxSpeed() {
        return getxSpeed();
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("[x=%d, y=%d, xSpeed=%d, ySpeed=%d]", x, y, xSpeed, ySpeed);
    }
}
