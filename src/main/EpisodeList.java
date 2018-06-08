package main;

import java.util.ArrayList;
import java.util.Random;

class EpisodeList {

    private ArrayList<Episode> episodes = new ArrayList<>();

    EpisodeList() {
        episodes = new ArrayList<>();
    }

    void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    Episode getEpisode(int episodeNumber) {
        return episodes.get(episodeNumber + 1);
    }

    Episode getRandomEpisode() {
        return episodes.get(new Random().nextInt(episodes.size()));
    }
}
