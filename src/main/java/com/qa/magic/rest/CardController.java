package com.qa.magic.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.magic.persistence.domain.Card;
import com.qa.magic.service.CardService;

@RestController
@RequestMapping("/card")
@CrossOrigin(origins = "http://localhost:3000")
public class CardController {

	private CardService service;
	
	public CardController(CardService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAll")
	public List<Card> getAllCards(){
		return this.service.getAllCards();
	}
	
	@PostMapping("/addCard")
	public String addcard(@RequestBody Card newCard) {
		return this.service.addCard(newCard);
	}
	
	@DeleteMapping("/deleteCard/{id}")
	public String deleteCard(@PathVariable("id") long id) {
		return this.service.deleteCard(id);
	}
	
}
