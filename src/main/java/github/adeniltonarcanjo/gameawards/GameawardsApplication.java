package github.adeniltonarcanjo.gameawards;

import github.adeniltonarcanjo.gameawards.entities.Game;
import github.adeniltonarcanjo.gameawards.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class GameawardsApplication {


	public static void main(String[] args) {
		SpringApplication.run(GameawardsApplication.class, args);

	}


}
