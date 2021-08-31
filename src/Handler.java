import java.awt.*;
import java.util.*;

public class Handler {
    private Queue<Ball> balls;

    private Random r;

    public Handler(int width, int height, int ballCount){
        r = new Random();
        balls = new LinkedList<Ball>();
        for (int i = 0; i < ballCount; i++){
            int x = r.nextInt(width) - 10;
            int y =  Math.min(height, (int) (50 + Math.abs(r.nextGaussian()) * 300));
            int size = (int) (30.0 * y / height);
            balls.add(new Ball(x, y, size, (1.0 * i + 1) / ballCount));
        }
    }

    public void tick(int width, int height){
        balls.poll();


        int y =  Math.min(height, (int) (50 + Math.abs(r.nextGaussian()) * 300));
        int x = r.nextInt(width) - 10;
        int size = (int) (30.0 * (y - 20) / height);
        balls.add(new Ball(x, y, size, 1.0));

        for (Ball ball : balls){
            ball.setAlpha(ball.getAlpha() - 1.0 / balls.size());
            if (r.nextBoolean()){
                ball.setY(ball.getY() - 1);
            }
        }
    }

    public void render(Graphics g, int width, int height){
        g.setColor(new Color(200, 200, 200));
        g.fillRect(0, 0, width, height);
        for (Ball ball : balls) {
            int alpha = (int) (ball.getAlpha() * 255);
            Color myColour = new Color(25, 25, 205, alpha);
            g.setColor(myColour);
            g.fillOval(ball.getX(), ball.getY(), ball.getSize() + 3, ball.getSize() + 3);
        }
    }
}
