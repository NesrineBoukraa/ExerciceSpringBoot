package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.CreditCardPayment;

public interface CreditCardRepository extends JpaRepository<CreditCardPayment, Long> {

}