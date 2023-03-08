package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// ctrl+shift+o ile kullanılmayan importları uçurabiliriz

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //otomatik id oluşturtur veritabanında
	@Column(name="id") // veritabanında bir kolona isim verildi
	private int id;
	@Column(name="name")
	private String name;
}

//Brand -->id,name,quantity
//GetAllBrandsResponse-->id,name
//mapping