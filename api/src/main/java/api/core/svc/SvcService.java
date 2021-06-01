package api.core.svc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SvcService {
    @GetMapping(
            value = "/svc/{svcmgmtnum}",
            produces = "application/json")
    List<Svc> getSvcs(@RequestParam(value = "feeprodid", required = true) String feeprodid);
}
