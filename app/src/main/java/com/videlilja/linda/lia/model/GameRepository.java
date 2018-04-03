package com.videlilja.linda.lia.model;

import java.util.ArrayList;
import java.util.List;

public class GameRepository {

    public List<Game> getGames() {
        Game animals = new Game("Djur", Games.ANIMALS);
        Game nature = new Game("Natur", Games.NATURE);
        Game math = new Game("Matte", Games.MATH);
        Game flags = new Game("Flaggor", Games.FLAGS);
        Game capitals = new Game("Huvudstäder", Games.CAPITALS);

        List<Game> games = new ArrayList<>();
        games.add(animals);
        games.add(nature);
        games.add(math);
        games.add(flags);
        games.add(capitals);

        return games;

    }

}
