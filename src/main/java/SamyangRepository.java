import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamyangRepository extends JpaRepository<Samyang, Integer> {
    // Additional custom queries if needed
}
