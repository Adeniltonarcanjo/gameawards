package github.adeniltonarcanjo.gameawards.services.impl;


import github.adeniltonarcanjo.gameawards.entities.Game;
import github.adeniltonarcanjo.gameawards.repositories.GameRepository;
import github.adeniltonarcanjo.gameawards.services.GameService;
import github.adeniltonarcanjo.gameawards.services.exception.BusinessException;
import github.adeniltonarcanjo.gameawards.services.exception.NoContetException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findALl() {
        List<Game> game = repository.findAll();
        return game;
    }

    @Override
    public Game findById(Long id) {
        Optional<Game> game = repository.findById(id);
        return game.orElseThrow(()-> new NoContetException());
    }

    @Override
    public void insert(Game game) {
        repository.save(game);

    }

    @Override
    public void update(Long id, Game game) {
        Game gameDb=findById(id);
        if(gameDb.getId().equals(game.getId())){
            repository.save(game);
        }else {
            throw new BusinessException(" os ids são diferentes");
        }
    }

    @Override
    public void delete(Long id) {
        Game gameDb = findById(id);
        repository.delete(gameDb);
    }
}
