package com.miniswing.api.core.svc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SvcService {
    @GetMapping(
            value = "/svc/{feeprodid}",
            produces = "application/json")
    List<Svc> getSvcs(@RequestParam(value = "feeprodid", required = false) String feeprodid);
}
