package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Player;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PlayerRepository;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class CharacterCreationApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(CharacterCreationApplication.class, args);
	}
	
	@Autowired
	PlayerRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Player c = appContext.getBean("player", Player.class);
		c.setHealth(20);
		repo.save(c);
		
		Player sky = new Player("Sky", false, true, 20, 2);
		repo.save(sky);
		
		List<Player> allMyPlayers = repo.findAll();
		for(Player characters : allMyPlayers) {
			System.out.println(characters.toString());
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}

}
