package com.miniswing.api.core.cust;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CustService {
    @GetMapping(
            value = "/cust/{custnum}",
            produces = "application/json")
    Cust getCust(@PathVariable String svcmgmtnum);
}
