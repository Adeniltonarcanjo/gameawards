package github.adeniltonarcanjo.gameawards.resouces;

import github.adeniltonarcanjo.gameawards.entities.Game;
import github.adeniltonarcanjo.gameawards.services.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/games")
@Api(value = "Api votação de jogos")
@CrossOrigin(origins = "*")
public class GameRestController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    @ApiOperation(value="Query all games")
    public ResponseEntity<List<Game>> findAll(){
        List<Game> games = gameService.findALl();
        return ResponseEntity.ok().body(games);
    }

    @GetMapping(value = {"/{id}"})
    @ApiOperation(value="Query games by id")
    public ResponseEntity<Game> findById(@PathVariable Long id){
        Game game = gameService.findById(id);
        return ResponseEntity.ok().body(game);
    }

    @PostMapping()
    @ApiOperation(value="Register game")
    public ResponseEntity<Game> insert(@RequestBody Game game){
        gameService.insert(game);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(game.getId()).toUri();
        return ResponseEntity.created(uri).body(game);
    }

    @PutMapping(value = "/{id}")
    @ApiOperation(value="Update Game")
    public ResponseEntity<Game> update(@PathVariable Long id, @RequestBody Game game){
        gameService.update(id,game);
        return ResponseEntity.ok().body(game);
    }


    @DeleteMapping(value = "/{id}")
    @ApiOperation(value="Delete game")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        gameService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
