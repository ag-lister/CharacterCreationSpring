package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "player_name")
	private String characterName;
	@Column(name = "hasSword")
	private boolean hasSword;
	@Column(name = "hasShield")
	private boolean hasShield;
	@Column(name = "health")
	private int health;
	@Column(name = "potions")
	private int potions;
	
	public Player() {
		super();
	}

	public Player(String characterName, int health, int potions) {
		super();
		this.characterName = characterName;
		this.health = health;
		this.potions = potions;
	}

	public Player(String characterName, boolean hasSword, boolean hasShield, int health, int potions) {
		super();
		this.characterName = characterName;
		this.hasSword = hasSword;
		this.hasShield = hasShield;
		this.health = health;
		this.potions = potions;
	}

	public Player(long id, String characterName, boolean hasSword, boolean hasShield, int health, int potions) {
		super();
		this.id = id;
		this.characterName = characterName;
		this.hasSword = hasSword;
		this.hasShield = hasShield;
		this.health = health;
		this.potions = potions;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public boolean isHasSword() {
		return hasSword;
	}

	public void setHasSword(boolean hasSword) {
		this.hasSword = hasSword;
	}

	public boolean isHasShield() {
		return hasShield;
	}

	public void setHasShield(boolean hasShield) {
		this.hasShield = hasShield;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getPotions() {
		return potions;
	}

	public void setPotions(int potions) {
		this.potions = potions;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", characterName=" + characterName + ", hasSword=" + hasSword + ", hasShield="
				+ hasShield + ", health=" + health + ", potions=" + potions + "]";
	}

	
	
	
}
