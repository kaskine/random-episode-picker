package main;

class Episode {

    private String name;
    private int seasonNumber;
    private int episodeNumber;

    Episode(String name, int seasonNumber, int episodeNumber) {
        this.name = name;
        this.seasonNumber = seasonNumber;
        this.episodeNumber = episodeNumber;
    }

    public String getName() {
        return name;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String toString() {
        return episodeNumber < 10
               ? "S0" + seasonNumber + "E0" + episodeNumber + " - " + name
               : "S0" + seasonNumber + "E" + episodeNumber + " - " + name;
    }
}
