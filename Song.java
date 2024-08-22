
public class Song {
    private String name;
    private String artist;
    private int songLength;


    public Song() {
        setName("Blank");
        setArtist("Unknown");
        setSongLength(0);
    }


    public Song(String name, String artist, int songLength) {
        setName(name);
        setArtist(artist);
        setSongLength(songLength);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;

    }


    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getSongLength() {
        return this.songLength;
    }

    public boolean equals(Song song) {
        return getName().equals(song.name) && getArtist().equals(song.artist) && getSongLength() == song.songLength;
    }

    @Override
    public String toString() {

        return String.format("Song Name: %s\nArtist: %s\nLength: %d:%02d\n", getName(), getArtist(),
                getSongLength() / 60, getSongLength() % 60);
    }
}
