package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entities.UserInformation;

public interface UserInfoRepository extends JpaRepository<UserInformation, Long> {

}
