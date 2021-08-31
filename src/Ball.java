public class Ball {
    private int x;
    private int y;
    private int size;
    private double alpha;

    public Ball(){
        this(0, 0, 0, 0);
    }

    public Ball(int x, int y, int size){
        this(x, y, size, 1.0);
    }

    public Ball(int x, int y, int size, double alpha){
        this.x = x;
        this.y = y;
        this.size = size * 2;
        this.alpha = alpha;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSize(){
        return size;
    }

    public double getAlpha(){
        return alpha;
    }

    public void setX(int num){
        x = num;
    }

    public void setY(int num){
        y = num;
    }

    public void setSize(int num){
        size = num;
    }

    public void setAlpha(double num){
        alpha = num;
    }

}
