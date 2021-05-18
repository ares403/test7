package com.miniswing.prodservice.web;

import com.miniswing.prodservice.service.ProdService;
import com.miniswing.prodservice.web.dto.ProdResponseDto;
import com.miniswing.prodservice.web.dto.ProdSaveRequestDto;
import com.miniswing.prodservice.web.dto.ProdUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProdApiController {
    private final ProdService prodService;

    @PostMapping("/api/v1/prod")
    public void save(@RequestBody ProdSaveRequestDto requestDto) {
        prodService.save(requestDto);
    }

    @PutMapping("/api/v1/prod/{id}")
    public void update(@PathVariable Long id, @RequestBody ProdUpdateRequestDto requestDto) {
        prodService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/prod/{id}")
    public void delete(@PathVariable Long id) {
        prodService.delete(id);
    }

    @GetMapping("/api/v1/prod/{id}")
    public ProdResponseDto findById(@PathVariable Long id) {
        return prodService.findById(id);
    }

}
