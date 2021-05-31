package com.miniswing.svcservice.web;

import com.miniswing.svcservice.service.SvcService;
import com.miniswing.svcservice.web.dto.SvcResponseDto;
import com.miniswing.svcservice.web.dto.SvcSaveRequestDto;
import com.miniswing.svcservice.web.dto.SvcUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SvcApiController {

    private final SvcService svcService;

    @PostMapping("/api/v1/svc")
    public void save(@RequestBody SvcSaveRequestDto requestDto) {
        svcService.save(requestDto);
    }

    @PutMapping("/api/v1/svc/{id}")
    public void update(@PathVariable Long id, @RequestBody SvcUpdateRequestDto requestDto) {
        svcService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/svc/{id}")
    public void delete(@PathVariable Long id) {
        svcService.delete(id);
    }

    @GetMapping("/api/v1/svc/{svcmgmtnum}")
    public SvcResponseDto findBySvcmgmtnum(@PathVariable Long svcmgmtnum) {
        return svcService.findBySvcmgmtnum(svcmgmtnum);
    }


}
