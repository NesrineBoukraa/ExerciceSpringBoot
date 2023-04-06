package tn.projet.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.Userr;

public interface UserRepository extends JpaRepository<Userr, Long> {

}
