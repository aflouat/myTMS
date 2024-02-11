package fr.aflouat.MyTMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyTmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTmsApplication.class, args);
		System.out.println("TMS Demo!");
	}

}
