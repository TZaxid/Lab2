package task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Artist {
    private final static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d.M.yyyy");
    private int id;
    private String artist;
    private boolean band;
    private LocalDate sdate;

    public Artist(int id, String artist, boolean band, String sdate) {
        this.id = id;
        this.artist = artist;
        this.band = band;
        this.sdate = LocalDate.parse(sdate, DATE_FORMATTER);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id < Integer.MAX_VALUE) {
            this.id = id;
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if (artist != null) {
            this.artist = artist;
        }
    }

    public boolean getBand() {
        return band;
    }

    public void satBand(boolean band) {
        this.band = band;
    }

    public LocalDate getSdate() {
            return sdate;
    }

    public void setPubYear(String sdate) {
        this.sdate = LocalDate.parse(sdate, DATE_FORMATTER);
    }

    public void show() {
        System.out.println("#" + id + " " + artist + " in band-" + band + " " + sdate);
    }
}


