package tn.projet.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Paypal")
public class PaypalPayment extends Payment {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String accountNumber;
}