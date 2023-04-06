package tn.projet.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Commande implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idCommand;
private Date commandDate;

@ManyToOne
private Userr user;

@OneToOne
private Payment payment;

@OneToMany
private Collection<CommandLine> commandlines;

public void addCommandLine(CommandLine commandlines) {
	// TODO Auto-generated method stub
	
}




//@ManyToOne
//private User user;
//@OneToOne
//private Payment Paye;
//@OneToMany
//private Collection<CommandLine> commandlines;
}
