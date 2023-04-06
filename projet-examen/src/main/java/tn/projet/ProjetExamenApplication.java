package tn.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import java.sql.Date;
import java.text.DateFormat;
import tn.projet.dao.UserRepository;
import tn.projet.dao.PaymentRepository;
import tn.projet.dao.RoleRepository;
import tn.projet.dao.UserInfoRepository;
import tn.projet.dao.ArticleRepository;
import tn.projet.dao.CommandLineRepository;
import tn.projet.dao.CommandeRepository;
import tn.projet.entities.Payment;
import tn.projet.entities.Userr;
import tn.projet.entities.Article;
import tn.projet.entities.Role;
import tn.projet.entities.UserInformation;
import tn.projet.entities.Commande;
import tn.projet.entities.CommandLine;


@SpringBootApplication
public class ProjetExamenApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ProjetApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(ProjetExamenApplication.class, args);
        
        // repositories
        UserRepository userRepository = context.getBean(UserRepository.class);
        UserInfoRepository userInformationsRepository = context.getBean(UserInfoRepository.class);
        ArticleRepository articleRepository = context.getBean(ArticleRepository.class);
        CommandeRepository commandeRepository = context.getBean(CommandeRepository.class);
        CommandLineRepository commandeLineRepository = context.getBean(CommandLineRepository.class);
        RoleRepository roleRepository = context.getBean(RoleRepository.class);
        PaymentRepository PaymentRepository = context.getBean(PaymentRepository.class);
        //role
        
		Role admin = new Role();	
		admin.setRolename("admin");
		Role userRole = new Role();
		userRole.setRolename("User");
		
		roleRepository.save(admin);
		roleRepository.save(userRole);
		
        // information de l'utilisateur
        UserInformation userInformations1 = new UserInformation();
        userInformations1.setAddress("20 abu kacem chebbi");
        userInformations1.setCity("Tunis");
        userInformations1.setEmail("nesrine@example.com");
        userInformations1.setPhoneNumber("22333444");
        
        UserInformation userInformations2 = new UserInformation();
        userInformations2.setAddress("montfleury");
        userInformations2.setCity("Tunis");
        userInformations2.setEmail("sabrine@example.com");
        userInformations2.setPhoneNumber("22888999");
        
        userInformationsRepository.save(userInformations1);
        userInformationsRepository.save(userInformations2);
        //user
        Userr user = new Userr();
        user.setLogin("nesrine");
        user.setPassword("password");
        user.setConnectionNumber(0);
        user.setRoles(admin);
        user.setUserinfo(userInformations1);
        Userr user2 = new Userr();
        user2.setLogin("sabrine");
        user2.setPassword("password");
        user2.setConnectionNumber(0);
        user2.setRoles(userRole);
        user2.setUserinfo(userInformations2);
        
        userRepository.save(user);
        userRepository.save(user2);
        
        // Ajout d'un article 
        Article article = new Article();
        article.setDescription("smartphone");
        article.setBrand("iphone");
        article.setPrice(1500.0);
        Article article2 = new Article();
        article2.setDescription("smartphone");
        article2.setBrand("samsung");
        article2.setPrice(900.0);
        articleRepository.save(article);
        articleRepository.save(article2);
       
       
        // commande
        Commande commande = new Commande();
        commande.setCommandDate(new Date(System.currentTimeMillis()));
        commande.setPayment(null);
        commande.setUser(user);
        CommandLine line1 = new CommandLine();
        line1.setQuantity(2);
        line1.setCommande(commande);  
        commande.addCommandLine(line1);
        commandeRepository.save(commande);
        commandeLineRepository.save(line1);
        //payement
       
       Payment pay=new Payment();
        pay.setCommande(commande);  
        pay.setAmount(120);
        pay.setPaymentDate(new Date(System.currentTimeMillis()));
        PaymentRepository.save(pay);
       
     
	}

}
