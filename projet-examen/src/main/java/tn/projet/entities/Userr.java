package tn.projet.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Userr implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idUser;
private String login;
private String password;
private int connectionNumber;

@OneToOne
private UserInformation userinfo;

@ManyToMany
private Collection<Role> Roles;
@OneToMany
private Collection<Commande> commande;

public void setRoles(Role roles) {
	// TODO Auto-generated method stub
	
}
//@ManyToMany
//private Collection<Role> roles;
//@OneToOne
////private UserInformation userinfo;
//@OneToMany
//private Collection<Commande> commands;
}
