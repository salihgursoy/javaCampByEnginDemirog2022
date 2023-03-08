package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// id ye göre markayı getirmek için
public class GetByIdBrandResponse {
	private int id ;
	private String name ;

}
