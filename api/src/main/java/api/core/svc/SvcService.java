package api.core.svc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface SvcService {
    @GetMapping(
            value = "/svc/{svcmgmtnum}",
            produces = "application/json")
    Svc getSvc(@PathVariable Long svcmgmtnum);
}
