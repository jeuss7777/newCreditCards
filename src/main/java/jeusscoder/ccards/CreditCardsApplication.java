package jeusscoder.ccards;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CreditCardsApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(CreditCardsApplication.class, args);
		
	}
	
}
