/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Aykut Akova
 * Student ID:  250446032
 * Date:        19.10.2026
 */
public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // --- Default constructor ---
        Track defaultTrack = new Track();
        System.out.println("Default Track: ");
        System.out.println(defaultTrack);
        System.out.println();

        // --- Title-only constructor ---
        Track titleOnlyTrack = new Track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(titleOnlyTrack);
        System.out.println();

        // --- Title + artist constructor ---
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack);
        System.out.println();

        // --- Full constructor ---
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack);
        System.out.println();

        // --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        Track brokenTrack = new Track("Broken Clock", "Static Noise", -45, false);
        System.out.println(brokenTrack);
        System.out.println();

        // --- Getter test ---
        Track testTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Getter Test:");
        System.out.println("Title:     " + testTrack.getTitle());
        System.out.println("Artist:    " + testTrack.getArtist());
        System.out.println("Duration:  " + testTrack.getDurationFormatted());
        System.out.println("Explicit:  " + testTrack.isExplicit());
    }
}