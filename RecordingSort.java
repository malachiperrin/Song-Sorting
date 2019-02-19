// Filename: RecordingSort.java
// Author Malachi
// Date: 2/13/19
// Application that allows the user to enter data for 5 recordings. Then ask the user how the output of all recordings should be sorted. They can sort by artist, song, or playing time.

import javax.swing.JOptionPane;
public class RecordingSort
{
    public static void main(String[] args)
    {
        // Variables and Constants
        Recording[] songList = new Recording[5];
        String song;
        String artist;
        int time;
        String order; // Use this variable when you ask the user how they want the data sorted

        // For loop that will create the 5 Recording objects that will fill our songList array
        for (int i = 0; i < songList.length; i++)
        {
            song = JOptionPane.showInputDialog(null, "Enter a song title for recording " + (i + 1));
            artist = JOptionPane.showInputDialog(null, "Enter artist name for recording " + (i + 1));
            time = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length in seconds for recording " + (i + 1)));

            // Build a Recording object with the default constructor
            Recording tempSong = new Recording();

            // Use the setters!
            tempSong.setSongTitle(song);
            tempSong.setArtist(artist);
            tempSong.setPlayingTime(time);
            songList[i] = tempSong;
        }
        order = JOptionPane.showInputDialog(null, "By which field would you like to sort the data?\nYou can sort by Song, Artist, or Time");
        order = order.toUpperCase();

        // Decide which sort option they pick
        if (order.charAt(0) == 'S')
        {
            sortBySong(songList);
        }
        else
        {
            if (order.charAt(0) == 'A')
            {
                sortByArtist(songList);
            }
            else
            {
                sortByTime(songList);
            }
        }
        // Sorting is done by other methods, we're ready for output here in the main() method
        String message = "";
        for (int i = 0; i < songList.length; i++)
        {
            message = message + "\nArtist: " + songList[i].getArtist() + "\nSong: " + songList[i].getSongTitle() + "\nPlaying Time: " + songList[i].getPlayTime();
        }
        JOptionPane.showMessageDialog(null, message);
    } // End of main method

    // This is method used when the user chooses the data to be sorted by SONG
    public static void sortBySong(Recording[] array)
    {
        int a, b;
        Recording temp;
        String stringB, stringbPlus;

        for (a = 0; a < array.length - 1; a++)
        {
            for (b = 0; b < array.length - 1; b++)
            {
                stringB = array[b].getSongTitle();
                stringbPlus = array[b + 1].getSongTitle();

                if (stringB.compareTo(stringbPlus) > 0)
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }

    // This is method used when the user chooses the data to be sorted by ARTIST
    public static void sortByArtist(Recording[] array)
    {
        int a, b;
        Recording temp;
        String stringB, stringbPlus;

        for (a = 0; a < array.length - 1; a++)
        {
            for (b = 0; b < array.length - 1; b++)
            {
                stringB = array[b].getArtist();
                stringbPlus = array[b + 1].getArtist();

                if (stringB.compareTo(stringbPlus) > 0)
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }

    // This is method used when the user chooses the data to be sorted by TIME
    public static void sortByTime(Recording[] array)
    {
        int a, b;
        Recording temp;

        for (a = 0; a < array.length - 1; a++)
        {
            for (b = 0; b < array.length - 1; b++)
            {
                stringB = array[b].getPlayTime();
                stringbPlus = array[b + 1].getPlayTime();

                if (array[b].getPlayTime() > array[b + 1].getPlayTime())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }
}
