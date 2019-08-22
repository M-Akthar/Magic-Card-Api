package com.qa.magic.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.magic.persistence.domain.Card;

public interface CardRepo extends JpaRepository<Card, Long> {

}
