package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Player;

@Configuration
public class BeanConfiguration {
	@Bean
	public Player player() {
		Player bean = new Player("Amanda", 20, 2);
		return bean;
	}
}
