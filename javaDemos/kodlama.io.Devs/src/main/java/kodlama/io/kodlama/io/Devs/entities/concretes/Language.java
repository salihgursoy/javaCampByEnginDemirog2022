package kodlama.io.kodlama.io.Devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import javax.persistence.*;

@Table(name="languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="language_name")
	private String name;
	
	@OneToMany(mappedBy = "language")
	private List<Technology> technologies;
}
