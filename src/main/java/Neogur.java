import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "Neogur")
public class Neogur extends Ramen {
    public Neogur(int id, String name, int price) {
        super(id, name, price);
    }
}
