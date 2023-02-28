package game.utils;

import java.awt.image.BufferStrategy;
import java.awt.Graphics;

import gfx.assets.Display;

import game.states.State;
import game.states.GameState;

public class GameHandler {

    private BufferStrategy bufferStrategy;
    private Graphics g;

    private Display display;

    public static final int SCREEN_WIDTH = 1408;
    public static final int SCREEN_HEIGHT = 1024;
    private final String GAME_TITLE = "Hello Kitty";

    private State gameState;

    public static void main(String[] args) {
        GameHandler game = new GameHandler();
        game.init();
    }

    public void init() {
        display = new Display(GAME_TITLE, SCREEN_HEIGHT, SCREEN_WIDTH);

        gameState = new GameState();

        run();
    }

    public void tick() {

    }

    private void render(Graphics g) {
        bufferStrategy = display.getCanvas().getBufferStrategy();
        if(bufferStrategy == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

        gameState.render(g);

        bufferStrategy.show();
        g.dispose();
    }

    private void run() {
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while(true){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if(delta >= 1){
                tick();
                render(g);
                ticks++;
                delta--;
            }

            if(timer >= 1000000000){
                // System.out.println("FPS: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
    }

}