package github.adeniltonarcanjo.gameawards.resouces;

import github.adeniltonarcanjo.gameawards.entities.Game;
import github.adeniltonarcanjo.gameawards.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class GameRestController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "games")
    public ResponseEntity<List<Game>> findAll(){
        List<Game> games = gameService.findALl();
        return ResponseEntity.ok().body(games);
    }

    @GetMapping(value = {"games/{id}"})
    public ResponseEntity<Game> findById(@PathVariable Long id){
        Game game = gameService.findById(id);
        return ResponseEntity.ok().body(game);
    }

    @PostMapping(value = "games")
    public ResponseEntity<Game> insert(@RequestBody Game game){
        gameService.insert(game);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(game.getId()).toUri();
        return ResponseEntity.created(uri).body(game);
    }

    @PutMapping(value = "games/{id}")
    public ResponseEntity<Game> update(@PathVariable Long id, @RequestBody Game game){
        gameService.update(id,game);
        return ResponseEntity.ok().body(game);
    }


    @DeleteMapping(value = "games/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        gameService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
