package BackendMK1.demo.contoller;

import BackendMK1.demo.model.ParliamentSeat;
import BackendMK1.demo.service.PSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ps")
public class PSContoller {

    @Autowired
    private PSService psService;

    @PostMapping("/")
    public ParliamentSeat createPS(@RequestBody ParliamentSeat parliamentSeat) throws Exception {
        return this.psService.createPS(parliamentSeat);
    }
}
