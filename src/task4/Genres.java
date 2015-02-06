package task4;

import java.util.ArrayList;

public class Genres {
    private ArrayList<Artist> artists;
    private int gid;
    private String gname;

    public Genres(int gid, String gname) {
        this.gid = gid;
        this.gname = gname;
        this.artists = new ArrayList<Artist>();
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public void showArtists() {
        for (Artist ar : artists) {
            ar.show();
        }
    }

    public boolean isArtistPresent(Artist inAr) {
        for (Artist ar : artists) {
            if (inAr.getId() == ar.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean addArtist(Artist ar) {
        if (!isArtistPresent(ar)) {
            artists.add(ar);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeArtist(Artist ar) {
        if (isArtistPresent(ar)) {
            artists.remove(ar);
            return true;
        } else {
            return false;
        }
    }
}
