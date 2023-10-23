package session15.challanges.challange_4;

import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private String duration;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Song song = (Song) object;
        return Objects.equals(getTitle(), song.getTitle()) && Objects.equals(getArtist(), song.getArtist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getArtist());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        Song song1 = new Song("Diamonds","Rihanna");
        Song song2 = new Song("Diamonds","Rihanna");
        System.out.println(song1.equals(song2));
        System.out.println(song1.hashCode());
        System.out.println(song2.hashCode());
    }
}
