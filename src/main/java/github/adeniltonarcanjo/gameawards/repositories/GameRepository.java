package github.adeniltonarcanjo.gameawards.repositories;

import github.adeniltonarcanjo.gameawards.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {

}
