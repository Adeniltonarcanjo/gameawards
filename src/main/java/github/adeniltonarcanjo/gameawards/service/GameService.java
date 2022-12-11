package github.adeniltonarcanjo.gameawards.service;

import github.adeniltonarcanjo.gameawards.domain.Game;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface GameService {
    List<Game> findALl();

    Game findById(Long id);

    void insert(Game game);

    void update(Long id, Game game);

    void delete(Long id);



}
