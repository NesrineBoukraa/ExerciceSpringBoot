package tn.projet.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CreditCard")
public class CreditCardPayment extends Payment {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String cardNumber;
private String expirationDate;
}
