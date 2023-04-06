package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
