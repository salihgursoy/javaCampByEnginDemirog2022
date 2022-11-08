package kodlama.io.kodlama.io.Devs.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Technology {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="technologyId")
    private int id;

    @Column(name="technologyName")
    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

}
