package api.core.prod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProdService {
    @GetMapping(
            value = "/prod/{prodid}",
            produces = "application/json")
    Prod getProd(@PathVariable String prodid);
}
