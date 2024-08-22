public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        String[] playlist = createPlaylist();
        printPlaylist(playlist);
    }

    private static String[] createPlaylist() {
        Song[] songs = new Song[3];
        String[] playlist = new String[3];
        /*
         * This could be modified to add user input but I'm keeping the data static for
         * the time being.
         * 
         */
        String[] names = { "Toxic", "Diamonds", "Mask Off" };
        String[] artists = { "Britney Spears", "Rihanna", "Future" };
        int[] lengths = { 199, 225, 204 };

        for (int i = 0; i < 3; i++) {
            songs[i] = new Song(names[i], artists[i], lengths[i]);
            playlist[i] = songs[i].toString();
        }

        // Check if the songs equal each other
        System.out.printf("Song 1 is equal to song 2: %b\n", songs[0].equals(songs[1]));
        return playlist;
    }

    /**
     * Iterate through the playlist created with {@link #createPlaylist()} and print
     * each song.
     * 
     * @param playlist Playlist created with {@link #createPlaylist()}
     */
    private static void printPlaylist(String[] playlist) {
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}