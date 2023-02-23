package game.states;

import game.assets.World;

import java.awt.*;

public class GameState extends State {

    private World world;

    public GameState() {
        world = new World();
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }
}