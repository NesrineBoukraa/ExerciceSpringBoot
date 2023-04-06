package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
