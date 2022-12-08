package github.adeniltonarcanjo.gameawards.repository;

import github.adeniltonarcanjo.gameawards.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {

}
