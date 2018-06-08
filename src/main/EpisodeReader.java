package main;

import java.util.Scanner;

class EpisodeReader {

    private static final String file = "episodes.txt";

    static EpisodeList readFile() {

        EpisodeList episodeList = new EpisodeList();
        int seasonNumber = 1;
        int previousEpisodeNumber = 0;

        Scanner scanner = new Scanner(ClassLoader.getSystemResourceAsStream(file));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String delimiters = "\t";
            String[] tokens = line.split(delimiters);

            String title = tokens[1].replace("\"", "");
            if (!title.isEmpty()) {
                int episodeNumber = Integer.parseInt(tokens[0]);
                if (episodeNumber < previousEpisodeNumber) {
                    seasonNumber++;
                }
                previousEpisodeNumber = episodeNumber;
                episodeList.addEpisode(new Episode(title, seasonNumber, episodeNumber));
            }
        }

        return episodeList;
    }
}
