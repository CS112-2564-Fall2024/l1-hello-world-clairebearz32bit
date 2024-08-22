
public class Song {
    private String name;
    private String artist;
    private int songLength;

    /**
     * Default constructor to fill with blank data
     */
    public Song() {
        setName("Blank");
        setArtist("Unknown");
        setSongLength(0);
    }

    /**
     * 
     * @param name       The name of the song
     * @param artist     The artist's name
     * @param songLength The name of the song in seconds that will be converted to
     *                   minutes and seconds in {@link #toString()}
     */
    public Song(String name, String artist, int songLength) {
        setName(name);
        setArtist(artist);
        setSongLength(songLength);
    }

    // Setters and getters all below, not much else to describe.
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

    /**
     * @param song Another song instance to compare the current to
     * @return whether or not the current {@link #Song()} instance is equal to
     */
    public boolean equals(Song song) {
        return getName().equals(song.name) && getArtist().equals(song.artist) && getSongLength() == song.songLength;
    }

    /**
     * @return a formatted string with the song's name, artist's name and the length
     *         in minutes and seconds using modulo and division
     */
    @Override
    public String toString() {

        return String.format("Song Name: %s\nArtist: %s\nLength: %d:%02d\n", getName(), getArtist(),
                getSongLength() / 60, getSongLength() % 60);
    }
}
