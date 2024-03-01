import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeogurRepository extends JpaRepository<Neogur, Integer> {
    // Additional custom queries if needed
}

