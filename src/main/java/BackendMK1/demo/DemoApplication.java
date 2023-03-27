package BackendMK1.demo;

import BackendMK1.demo.model.ParliamentSeat;
import BackendMK1.demo.service.PSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	public PSService psService;

	@Override
	public void run(String... args) throws Exception{
		System.out.println("Starting Code");

//		ParliamentSeat parliamentSeat = new ParliamentSeat();
//
//		parliamentSeat.setConstituency("Patna");
//		parliamentSeat.setElectedIndividual("Ravi Shankar Prasad");
//		parliamentSeat.setParty("BJP");
//		parliamentSeat.setAge(66);
//		parliamentSeat.setGender("Male");
//		parliamentSeat.setScore(10);
//
//		ParliamentSeat parliamentSeat1 = this.psService.createPS(parliamentSeat);
//		System.out.println(parliamentSeat1.getConstituency());


	}

}
