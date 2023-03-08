package kodlama.io.rentACar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}
	
	
	// IOC ye bir tane modelmapper ekledik vakti gelip lazım olduğunda kullanılması için
	// Bean anotasyonuyla da bir bug görürsen bunu yapman gerekir diye baştan uyarırız.
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	} 

}
