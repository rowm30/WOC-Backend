package BackendMK1.demo.service.impl;


import BackendMK1.demo.model.ParliamentSeat;
import BackendMK1.demo.repo.PSRepo;
import BackendMK1.demo.service.PSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PSServiceImpl implements PSService {

    @Autowired
    private PSRepo psRepo;





    @Override
    public ParliamentSeat createPS(ParliamentSeat parliamentSeat) throws Exception {
        ParliamentSeat local = this.psRepo.findByConstituency(parliamentSeat.getConstituency());
        if (local != null){
            System.out.println("Constitiency already present!!");
            throw new Exception("Constitiency already present!!");
        } else {

            local = this.psRepo.save(parliamentSeat);
        }

        return local;
    }
}
