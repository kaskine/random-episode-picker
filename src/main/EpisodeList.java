package main;

import java.util.ArrayList;
import java.util.Random;

class EpisodeList {

    private ArrayList<Episode> episodes;

    EpisodeList() {
        episodes = new ArrayList<>();
    }

    void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    Episode getRandomEpisode() {
        return episodes.get(new Random().nextInt(episodes.size()));
    }
}
