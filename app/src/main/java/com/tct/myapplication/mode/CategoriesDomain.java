package com.tct.myapplication.mode;

public class CategoriesDomain {
    String tile;
    String pic;

    public CategoriesDomain(String tile, String pic) {
        this.tile = tile;
        this.pic = pic;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
