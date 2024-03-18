package kodlama.io.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
@Entity
public class Car {
    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "plate", unique = true)
    private String plate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int State;  //1 = available  2 = rented  3 = maintenance

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}
