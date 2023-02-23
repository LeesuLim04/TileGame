package gfx.utils;
import gfx.assets.WorldTile;
import java.awt.image.BufferedImage;
public class ImageHandler {
    //actual; pixel size of sprite on sheet
    private final int SPRITE_TILE_WIDTH = 64, SPRITE_TILE_HEIGHT = 64;
    private WorldTile[] worldTileList;
    public ImageHandler(){
        worldTileList = new WorldTile[1024];
        createWorldTiles();
    }
    private void createWorldTiles(){
        BufferedImage primaryColorSheet = ImageLoader.loadImage("/primaryColorSheet.png");

        BufferedImage clear = primaryColorSheet.getSubimage(0, 0, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile clearTile = new WorldTile(clear, 0);
        setWorldTile(clearTile);

        BufferedImage white = primaryColorSheet.getSubimage(SPRITE_TILE_WIDTH, 0, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile whiteTile = new WorldTile(white, 1);
        setWorldTile(whiteTile);

        BufferedImage black = primaryColorSheet.getSubimage(SPRITE_TILE_WIDTH*2, 0, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile blackTile = new WorldTile(black, 2);
        setWorldTile(blackTile);

        BufferedImage red = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*2, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile redTile = new WorldTile(red, 3);
        setWorldTile(redTile);

        BufferedImage orange = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*3, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile orangeTile = new WorldTile(orange, 4);
        setWorldTile(orangeTile);

        BufferedImage yellow = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*4, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile yellowTile = new WorldTile(yellow, 5);
        setWorldTile(yellowTile);

        BufferedImage lightGreen = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*5, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile lightGreenTile = new WorldTile(lightGreen, 6);
        setWorldTile(lightGreenTile);

        BufferedImage turquoise = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*6, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile turquoiseTile = new WorldTile(turquoise, 7);
        setWorldTile(turquoiseTile);

        BufferedImage lightBlue = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*7, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile lightBlueTile = new WorldTile(lightBlue, 8);
        setWorldTile(lightBlueTile);

        BufferedImage blue = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*8, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile blueTile = new WorldTile(blue, 9);
        setWorldTile(blueTile);

        BufferedImage purple = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT*9, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile purpleTile = new WorldTile(purple, 10);
        setWorldTile(purpleTile);

        BufferedImage grey = primaryColorSheet.getSubimage(0, SPRITE_TILE_HEIGHT, SPRITE_TILE_WIDTH, SPRITE_TILE_HEIGHT);
        WorldTile greyTile = new WorldTile(grey, 11);
        setWorldTile(greyTile);
    }
    private void setWorldTile(WorldTile tile) {
        worldTileList[tile.getID()] = tile;
    }
    public WorldTile getWorldTile(int id){
        return worldTileList[id];
    }

}