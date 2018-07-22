package com.denieall.recyclerviewex.Model;

public class Movie {

    // Getter and Setter for name and plot
    private String name;
    private String year;
    private int poster;
    private String plot;
    private int wallpaper;

    public int getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(int wallpaper) {
        this.wallpaper = wallpaper;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public Movie(String name, int poster, String year, String plot, int wallpaper) {
        this.name = name;
        this.poster = poster;
        this.year = year;
        this.plot = plot;
        this.wallpaper = wallpaper;
    }


}
