package game.assets;

import java.awt.Graphics;

import gfx.assets.WorldTile;
import gfx.utils.ImageHandler;



public class World {

    private int worldHeight, worldRows;

    private int[][] age;



    private int[][] worldTile2DArray;

    /*
    private int[][] worldTile2DArray = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,0,0,0},
            {0,0,1,0,0,0,0,1,0,0},
            {0,1,0,1,0,0,1,0,1,0},
            {0,1,0,0,0,2,0,0,1,0},
            {0,0,1,0,1,1,0,1,0,0},
            {0,0,1,0,0,0,0,1,0,0},
            {0,0,1,0,1,1,0,1,0,0},
            {0,0,0,1,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
    };
     */

    private ImageHandler imageHandler;

    public World() {
        imageHandler = new ImageHandler();

        worldTile2DArray = new int[10][10];

        for(int r = 0; r < worldTile2DArray.length; r++) {
            for(int c = 0; c < worldTile2DArray[r].length; c++) {
                worldTile2DArray[r][c] = (int)(Math.random()*10);
            }
        }
    }

    public int[][] getWorldTile2DArray() {
        return worldTile2DArray;
    }

    public void setWorldTile2DArray(int[][] future) {
        worldTile2DArray = future;
    }

    public void render(Graphics g) {
        for (int r = 0; r < worldTile2DArray.length; r++) {
            for (int c = 0; c < worldTile2DArray[r].length; c++) {
                getWorldTile(r, c).render(g, c * 64, r * 64);
            }
        }
    }

    public WorldTile getWorldTile(int r, int c) {
        WorldTile tile = imageHandler.getWorldTile(worldTile2DArray[r][c]);
        if(tile == null) {
            return imageHandler.getWorldTile(1);
        }
        return tile;
    }

}