package model;

public class Album {
    private String name;
    private String artist;
    private String yearOfRelease;
    private String rating;

    public Album() {
    }

    public Album(String name, String artist, String yearOfRelease, String rating) {
        this.name = name;
        this.artist = artist;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public boolean isNull(){
        return name == null && artist == null && yearOfRelease == null && rating == null;
    }


}
