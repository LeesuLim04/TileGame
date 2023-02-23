package game.states;

import java.awt.Graphics;

public abstract class State {
    public State() {

    }

    public abstract void tick();

    public abstract void render(Graphics g);
}