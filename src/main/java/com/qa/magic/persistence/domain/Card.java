package com.qa.magic.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long cardID;
	
	private String title;
	private String manaCost;
	private String poster;
	private String type;
	private String expansion;
	private String abilities;
	private String flavourText;
	private String artistInfo;
	private String powerToughness;
	
	public long getCardID() {
		return cardID;
	}
	
	public void setCardID(long cardID) {
		this.cardID = cardID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getManaCost() {
		return manaCost;
	}
	
	public void setManaCost(String manaCost) {
		this.manaCost = manaCost;
	}
	
	public String getPoster() {
		return poster;
	}
	
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getExpansion() {
		return expansion;
	}
	
	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}
	
	public String getAbilities() {
		return abilities;
	}
	
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	
	public String getFlavourText() {
		return flavourText;
	}
	
	public void setFlavourText(String flavourText) {
		this.flavourText = flavourText;
	}
	
	public String getArtistInfo() {
		return artistInfo;
	}
	
	public void setArtistInfo(String artistInfo) {
		this.artistInfo = artistInfo;
	}
	
	public String getPowerToughness() {
		return powerToughness;
	}
	
	public void setPowerToughness(String powerToughness) {
		this.powerToughness = powerToughness;
	}

}
