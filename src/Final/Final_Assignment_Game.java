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
import java.awt.Font;
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
    int numObstacles = 0;
    //obstacles in the level
    Rectangle[] blocks = new Rectangle[numObstacles];
    boolean left = false;
    boolean right = false;
    boolean up = false;
    boolean down = false;
    int deadObstacles = 0;
    int ObstaclesLeft = numObstacles - deadObstacles;
    Font standard = new Font("impcat", Font.BOLD, 42);

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
        
        //set the color to black
        g.setColor(Color.BLACK);

        //go through each obstacle in the obstacle array 
        for (int i = 0; i < numObstacles; i++) {

            //fill each obstacle with its unique width and height as well as set it to its x and y
            g.fillOval(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);

        }

        //set the drawing color to blue
        g.setColor(Color.BLUE);

        //create the player with its preditermined values
        g.fillOval(player.x, player.y, player.width, player.height);

        //make walls (for visual effect only)
        g.fillRect(0, 0, 10, HEIGHT);
        g.fillRect(WIDTH - 10, 0, 10, HEIGHT);
        g.fillRect(0, 0, WIDTH, 10);
        g.fillRect(0, HEIGHT - 10, WIDTH, 10);
        
        //set the color to red
        g.setColor(Color.RED);

        //set the font to the standard font that was preditermined
        g.setFont(standard);

        //calculate the number of obstacles that are left
        ObstaclesLeft = numObstacles - deadObstacles;
        
        //if there are more than 0 obstacles left
        if (ObstaclesLeft > 0) {

            //display the number of obstacles left in the top of the screen
            g.drawString(("Obstacles Left: " + ObstaclesLeft), 50, 50);

        }

        //if there are no obstacles left
        if ((numObstacles - deadObstacles) == 0) {

            //display "YOU WIN!!!" on the screen
            g.drawString("YOU WIN!!!", (WIDTH / 2 - 100), (HEIGHT / 2));
        }




        //if the player was eaten by obstacles
        if (player.width == 0) {

            //display "YOU LOSE!!!" on the screen
            g.drawString("YOU LOSE!!!", (WIDTH / 2 - 100), (HEIGHT / 2));



        }

    }

    // GAME DRAWING ENDS HERE
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

        //come up with a random of obstacles to make
        int randNum = (int) (Math.random() * (20 - 1 + 1)) + 10;

        //numObstacles is the random number
        numObstacles = randNum;

        //new array with as many spots as there will be obstacles
        blocks = new Rectangle[randNum];

        //populate array with random x, y and height, then width is set to height  
        for (int i = 0; i < randNum; i++) {
            int randX = (int) (Math.random() * ((WIDTH - 54) - 1 + 1)) + 20;
            int randY = (int) (Math.random() * ((HEIGHT - 54) - 1 + 1)) + 20;
            int randH = (int) (Math.random() * (54 - 1 + 1)) + 10;
            int randW = randH;

            //solidify the values of each obstacle
            blocks[i] = new Rectangle(randX, randY, randW, randH);

            //go through each obstacle
            for (int j = 0; j < i; j++) {

                //check each for intersections
                while (blocks[i].intersects(blocks[j]) || blocks[i].intersects(player)) {

                    //if intersections are present send obstacle in question to new random location
                    blocks[i].x = (int) (Math.random() * ((WIDTH - 54) - 1 + 1)) + 20;
                    blocks[i].y = (int) (Math.random() * ((HEIGHT - 54) - 1 + 1)) + 20;

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

            //go through each obstacle
            for (int i = 0; i < numObstacles; i++) {

                //if player is bigger than obstacle
                if (player.width > blocks[i].width) {

                    //while the player and obstacle are overlaping
                    while (blocks[i].intersects(player)) {

                        //the obstacle gets smaller, and the player gets bigger
                        blocks[i].height = blocks[i].height - 3;
                        blocks[i].width = blocks[i].width - 3;
                        player.width = player.width + 1;
                        player.height = player.width;

                        //if the obsticle in question was eaten by the player
                        if (blocks[i].width <= 0) {

                            //add 1 to the number of dead obstacles
                            deadObstacles = deadObstacles + 1;





                        }
                    }

                //if the obstacle in question is bigger than the player
                } else {

                    //while the player overlaps the obstacle
                    while (blocks[i].intersects(player)) {

                        //make the obstacle bigger and the player smaller
                        blocks[i].height = blocks[i].height + 3;
                        blocks[i].width = blocks[i].width + 3;
                        player.width = player.width - 1;
                        player.height = player.width;

                    }
                }
            }
            
            //set controls to arrow keys
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

            if ((player.x + player.width) > WIDTH) {

                player.x = player.x - 2;

            }

            if (player.x < 0) {

                player.x = player.x + 2;

            }

            if ((player.y + player.height) > HEIGHT) {

                player.y = player.y - 2;

            }

            if (player.y < 0) {

                player.y = player.y + 2;

            }

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

            //find witch keys are being puched on the keyboard
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

            //player stops moving when key is released
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
