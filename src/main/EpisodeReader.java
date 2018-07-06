package main;

import java.text.DecimalFormat;
import java.util.Scanner;

class EpisodeReader {

    private static final String FILE = "episodes.txt";
    private static final String REGEX = "S\\d{2}[AB]?E\\d{2}";

    static EpisodeList readFile() {

        EpisodeList episodeList = new EpisodeList();
        Scanner scanner = new Scanner(ClassLoader.getSystemResourceAsStream(FILE));
        DecimalFormat decimalFormat = new DecimalFormat("00");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String delimiters = "\t";
            String[] tokens = line.split(delimiters);

            if (tokens[tokens.length - 1].matches(REGEX)) {

                String season = tokens[tokens.length - 1];
                String title = tokens[2].replace("\"", "");

                boolean isASeason = season.contains("A");
                boolean isBSeason = season.contains("B");

                if (season.contains("S00")) {
                    season = "S06" + season.substring(3);
                }
                else if (isASeason || isBSeason) {
                    int baseSeason = Integer.parseInt(season.substring(1, 3));

                    if (isASeason) {
                        season = "S" + decimalFormat.format(baseSeason + 1) + season.substring(4);
                    }
                    else {
                        season = "S" + decimalFormat.format(baseSeason + 2) + season.substring(4);
                    }
                }

                if (!title.isEmpty()) {
                    episodeList.addEpisode(new Episode(title, season));
                }
            }
        }

        return episodeList;
    }
}
