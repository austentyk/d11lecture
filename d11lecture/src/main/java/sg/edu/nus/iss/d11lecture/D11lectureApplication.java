package sg.edu.nus.iss.d11lecture;

import java.util.Collection;
import java.util.Collections;

import javax.swing.Spring;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D11lectureApplication {

	public static void main(String[] args) {

		//SpringApplication.run(D11lectureApplication.class, args);

		SpringApplication app = new SpringApplication(D11lectureApplication.class);

		String port = "8080";
		ApplicationArguments argOptions = new DefaultApplicationArguments(args); //detects arguments

		if(argOptions.containsOption("port")) {
			port = argOptions.getOptionValues("port").get(0); //use the argument as port
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port)); // sets the argument as port

		app.run(args);

		System.out.println("My first springboot application started...");
	}

}
