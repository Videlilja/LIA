package com.videlilja.linda.lia.model;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

public class GameRepository {

    public List<Game> getGames() {
        Game animals = new Game("Djur", Games.ANIMALS, R.drawable.smiley);
        Game nature = new Game("Natur", Games.NATURE, R.drawable.smiley);
        Game math = new Game("Matte", Games.MATH, R.drawable.smiley);
        Game flags = new Game("Flaggor", Games.FLAGS, R.drawable.smiley);
        Game capitals = new Game("Huvudstäder", Games.CAPITALS, R.drawable.smiley);
        Game words = new Game("Ordkunskap", Games.WORDS, R.drawable.smiley);

        List<Game> games = new ArrayList<>();
        games.add(animals);
        games.add(nature);
        games.add(math);
        games.add(flags);
        games.add(capitals);
        games.add(words);

        return games;

    }

}
