package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}

