package main;

class Episode {

    private String name;
    private String episodeNumber;

    Episode(String name, String episodeNumber) {
        this.name = name;
        this.episodeNumber = episodeNumber;
    }

    @Override
    public String toString() {
        return episodeNumber + " - " + name;
    }
}
