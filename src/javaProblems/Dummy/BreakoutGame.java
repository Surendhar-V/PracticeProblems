package javaProblems.Dummy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakoutGame extends JPanel implements ActionListener {
    private Timer timer;
    private Paddle paddle;
    private Ball ball;
    private Brick[][] bricks;
    private final int ROWS = 5;
    private final int COLS = 10;
    private boolean isGameOver = false;

    public BreakoutGame() {
        initGame();
    }

    private void initGame() {

        this.setFocusable(true);
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.BLACK);

        paddle = new Paddle();
        ball = new Ball();
        bricks = new Brick[ROWS][COLS];

        // Initialize bricks
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                bricks[i][j] = new Brick(j * 75 + 50, i * 30 + 50);
            }
        }

        timer = new Timer(10, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                paddle.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                paddle.keyReleased(e);
            }
        });

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isGameOver) {
            drawGameOver(g);
        } else {
            drawObjects(g);
        }
    }

    private void drawObjects(Graphics g) {

        paddle.draw(g);
        ball.draw(g);

        // Draw bricks
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (!bricks[i][j].isDestroyed()) {
                    bricks[i][j].draw(g);
                }
            }
        }

    }

    private void drawGameOver(Graphics g) {

        String gameOverText = "Game Over!";
        Font font = new Font("Helvetica", Font.BOLD, 30);
        FontMetrics metrics = getFontMetrics(font);
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(gameOverText, (getWidth() - metrics.stringWidth(gameOverText)) / 2, getHeight() / 2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ball.move();
        paddle.move();
        checkCollisions();
        repaint();
    }

    private void checkCollisions() {

        // Ball-paddle collision

        if (ball.getBounds().intersects(paddle.getBounds())) {
            ball.reverseYDirection();
        }

        // Ball-bricks collision
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (!bricks[i][j].isDestroyed() && ball.getBounds().intersects(bricks[i][j].getBounds())) {
                    ball.reverseYDirection();
                    bricks[i][j].setDestroyed(true);
                }
            }
        }

        // Ball hits bottom - game over
        if (ball.getY() > getHeight()) {
            isGameOver = true;
            timer.stop();
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Breakout Game");
        BreakoutGame game = new BreakoutGame();
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}

// Paddle class
class Paddle {

    private int x;
    private final int y;
    private int dx;
    private final int WIDTH = 100;
    private final int HEIGHT = 10;

    public Paddle() {
        x = 350;
        y = 550;
        dx = 0;
    }

    public void move() {
        x += dx;
        if (x < 0) x = 0;
        if (x > 700) x = 700; // Stay within window
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dx = -5;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dx = 5;
        }
    }

    public void keyReleased(KeyEvent e) {
        dx = 0;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }

}

// Ball class

class Ball {

    private int x;
    private int y;
    private int dx;
    private int dy;
    private final int size;

    public Ball() {
        x = 400;
        y = 300;
        dx = 2;
        dy = 2;
        size = 10;
    }

    public void move() {
        x += dx;
        y += dy;

        // Bounce off walls
        if (x < 0 || x > 790) {
            dx = -dx;
        }
        if (y < 0) {
            dy = -dy;
        }

    }

    public void draw(Graphics g) {

        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);

    }

    public void reverseYDirection() {
        dy = -dy;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, size, size);
    }

    public int getY() {
        return y;
    }
}

// Brick class
class Brick {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private boolean destroyed;

    public Brick(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 70;
        this.height = 20;
        this.destroyed = false;
    }

    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

}