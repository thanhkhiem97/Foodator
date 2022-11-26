package com.tct.myapplication.mode;

public class CategoriesDomain {
    String tile;
    int img;

    public CategoriesDomain(String tile, int pic) {
        this.tile = tile;
        this.img = img;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
