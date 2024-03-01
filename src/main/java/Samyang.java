import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "Samyang")
public class Samyang extends Ramen {
    public Samyang(int id, String name, int price) {
        super(id, name, price);
    }
}
