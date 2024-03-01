import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

@Repository
interface RamenRepository extends JpaRepository<Ramen, Integer> {
}

@Entity
@Data
class Ramen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int price;
    private boolean available;

    // Constructors
    public Ramen() {
    }

    public Ramen(String name, int price) {
        this.name = name;
        this.price = price;
        this.available = true;
    }

    // Methods
    public void sell() {
        this.available = false;
    }

    public void returnRamen() {
        this.available = true;
    }
}