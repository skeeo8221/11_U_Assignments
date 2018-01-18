package Final;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author skeeo8221
 */
public class Final_Assignment_Game extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (500) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    int playerX = 100;
    int playerY = 100;
    int playerW = 35;
    int playerH = playerW;
    Rectangle player = new Rectangle(playerX, playerY, playerW, playerH);
    int playerDX = 0;
    int playerDY = 0;
    int frameCount = 0;
    int numObsticles = 0;
    //blocks in the level
    Rectangle[] blocks = new Rectangle[numObsticles];
    boolean left = false;
    boolean right = false;
    boolean up = false;
    boolean down = false;

    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Final_Assignment_Game() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!


        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE



        g.setColor(Color.BLACK);


        //use a loop to generate random number and create obsticles
        for (int i = 0; i < numObsticles; i++) {


            g.fillOval(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);


        }

        g.setColor(Color.BLUE);

        g.fillOval(player.x, player.y, player.width, player.height);

        g.fillRect(0, 0, 10, HEIGHT);
        
        g.fillRect(WIDTH - 10, 0, 10, HEIGHT);
        
        g.fillRect(0 , 0, WIDTH, 10);
        
        g.fillRect(0, HEIGHT - 10, WIDTH, 10);




        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here


        int randNum = (int) (Math.random() * (20 - 1 + 1)) + 10;

        numObsticles = randNum;

        blocks = new Rectangle[randNum];


        for (int i = 0; i < randNum; i++) {
            int randX = (int) (Math.random() * (WIDTH - 1 + 1)) + 10;

            int randY = (int) (Math.random() * (HEIGHT - 1 + 1)) + 10;

            int randH = (int) (Math.random() * (54 - 1 + 1)) + 10;

            int randW = randH;

            blocks[i] = new Rectangle(randX, randY, randW, randH);



            if (i > 0) {
                while (blocks[i].intersects(blocks[i - 1])) {

                    blocks[i].x = blocks[i].x - 10;

                    blocks[i].y = blocks[i].y - 10;

                    i = i + 1;
                }


            }
        }

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();
            frameCount++;
            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 






            for (int i = 0; i < numObsticles; i++) {


                if (player.width > blocks[i].width) {

                    while (blocks[i].intersects(player)) {

                        blocks[i].height = blocks[i].height - 3;

                        blocks[i].width = blocks[i].width - 3;

                        player.width = player.width + 1;

                        player.height = player.width;



                    }

                } else {

                    while (blocks[i].intersects(player)) {

                        blocks[i].height = blocks[i].height + 3;

                        blocks[i].width = blocks[i].width + 3;

                        player.width = player.width - 1;

                        player.height = player.width;

                    }
                }
            }


            if (right) {

                playerDX = 2;

            } else if (left) {

                playerDX = -2;

            } else {

                playerDX = 0;



            }

            if (up) {

                playerDY = -2;

            } else if (down) {

                playerDY = 2;

            } else {

                playerDY = 0;


            }





            player.x = player.x + playerDX;
            player.y = player.y + playerDY;







            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            }

        }
    }

// Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

// Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {


            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) {
                left = true;

            }

            if (key == KeyEvent.VK_RIGHT) {
                right = true;

            }

            if (key == KeyEvent.VK_UP) {
                up = true;

            }

            if (key == KeyEvent.VK_DOWN) {
                down = true;

            }

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {



            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) {
                left = false;

            }

            if (key == KeyEvent.VK_RIGHT) {
                right = false;

            }

            if (key == KeyEvent.VK_UP) {
                up = false;

            }

            if (key == KeyEvent.VK_DOWN) {
                down = false;

            }


        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Final_Assignment_Game game = new Final_Assignment_Game();

        // starts the game loop
        game.run();
    }
}
