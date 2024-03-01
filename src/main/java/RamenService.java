import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RamenService {

    private final SamyangRepository samyangRepository;

    @Autowired
    public RamenService(SamyangRepository samyangRepository) {
        this.samyangRepository = samyangRepository;
    }

    public void addSamyang() {
        Samyang samyang = new Samyang(getId(), getName(), getPrice());
        samyangRepository.save(samyang);
        updateRamenAvailability(getId(), false);
    }

    // Other methods for update, delete, etc.

}
