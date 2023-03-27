package BackendMK1.demo.repo;

import BackendMK1.demo.model.ParliamentSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PSRepo  extends JpaRepository<ParliamentSeat, Long> {

    public ParliamentSeat findByConstituency(String constituency);
}
