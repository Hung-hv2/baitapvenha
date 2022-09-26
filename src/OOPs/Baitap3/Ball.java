package OOPs.Baitap3;
import java.util.Scanner;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private  float xDelta;
    private float yDelta;

    void inputBall(){
        Scanner Ball = new Scanner(System.in);
        System.out.println("Nhập giá trị x:" + x);
        this.x = Ball.nextInt();
        System.out.println("Nhập giá trị y" + y);
        this.y = Ball.nextInt();
    }

    // Hàm khởi tạo có đối số
    public Ball(float x,float y, int radius, float xDelta, float yDelta, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }
    void setX(float x){
        this.x = x;
    }

    public float getY() {
        return y;
    }
    void setY(float y){
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }
    void setRadius(int radius){
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }
    void setxDelta (int xDelta){
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }
    void setyDelta ( int yDelta ){
        this.yDelta = yDelta;
    }


    void move() {
        x += xDelta;
        y += yDelta;
    }


    void reflecHorizontal(){
        xDelta = -xDelta;
    }
    void reflecVertical(){
        yDelta = -yDelta;
    }
    public String toString(){
        return "Ball[("+x+", "+y+" , speed = ("+xDelta+","+yDelta+")]";  //sử dụng String.format ()
    }
}
