package github.adeniltonarcanjo.gameawards.services;

import github.adeniltonarcanjo.gameawards.entities.Game;

import java.util.List;

public interface GameService {
    List<Game> findALl();

    Game findById(Long id);

    void insert(Game game);

    void update(Long id, Game game);

    void delete(Long id);



}
