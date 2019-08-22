package com.qa.magic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.magic.persistence.domain.Card;
import com.qa.magic.persistence.repo.CardRepo;

@Service
public class CardService {

	private CardRepo repo;
	
	public CardService(CardRepo repo) {
		super();
		this.repo = repo;
	}
	
	public List<Card> getAllCards(){
		List<Card> all = repo.findAll();
		
		return all;
	}
	
	public String addCard(Card newCard) {
		repo.save(newCard);
		
		return "Success";
	}
	
	public String deleteCard(long id) {
		Optional<Card> card = repo.findById(id);
		
		if(card.isPresent()) {
			repo.deleteById(id);
			return "Delete successful";
		} else {
			return "Failed to delete";
		}
	}
	
}
