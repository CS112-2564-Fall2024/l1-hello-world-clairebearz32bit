public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        String[] album = createAlbum();
        printAlbum(album);
    }

    private static String[] createAlbum() {
        Song[] songs = new Song[3];
        String[] album = new String[3];
        String[] names = { "Toxic", "Diamonds", "Mask Off" };
        String[] artists = { "Britney Spears", "Rihanna", "Future" };
        int[] lengths = { 199, 225, 204 };

        for (int i = 0; i < 3; i++) {
            songs[i] = new Song(names[i], artists[i], lengths[i]);
            album[i] = songs[i].toString();
        }

        return album;
    }

    private static void printAlbum(String[] album) {
        for (String song : album) {
            System.out.println(song);
        }
    }
}