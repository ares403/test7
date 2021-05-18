package com.miniswing.custservice.service;

import com.miniswing.custservice.domain.Cust;
import com.miniswing.custservice.domain.CustRepository;
import com.miniswing.custservice.web.dto.CustResponseDto;
import com.miniswing.custservice.web.dto.CustSaveRequestDto;
import com.miniswing.custservice.web.dto.CustUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CustService {
    private final CustRepository custRepository;

    @Transactional
    public String save(CustSaveRequestDto requestDto) {
        return custRepository.save(requestDto.toEntity()).getCustnum();
    }

    @Transactional
    public Long update(Long id, CustUpdateRequestDto requestDto) {
        Cust cust = custRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        cust.update(requestDto.getCustnm(), requestDto.getAcntnum());

        return id;
    }

    @Transactional
    public void delete (Long id) {
        Cust cust = custRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        custRepository.delete(cust);
    }

    @Transactional(readOnly = true)
    public CustResponseDto findById(Long id) {
        Cust entity = custRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new CustResponseDto(entity);
    }
}
