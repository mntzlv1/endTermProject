
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Kimchi extends Ramen {

    // Constructors
    public Kimchi() {
    }

    public Kimchi(int id, String name, int price) {
        super(id, name, price);
    }

    // Methods
    @Override
    public void add() {
        // Implementation for adding Kimchi
    }

    public void update() {
        // Implementation for updating Kimchi
    }
}
