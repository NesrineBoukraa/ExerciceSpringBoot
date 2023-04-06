package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.PaypalPayment;

public interface PaypalRepository extends JpaRepository<PaypalPayment, Long> {

}