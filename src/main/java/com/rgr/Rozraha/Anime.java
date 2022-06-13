package com.rgr.Rozraha;

public class Anime {

    private String imageSrc;
    private String title;
    private int series;

    public Anime(String title, int series, String imageSrc) {
        this.title = title;
        this.series = series;
        this.imageSrc = imageSrc;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public String getTitle() {
        return title;
    }

    public int getSeries() {
        return series;
    }
}
