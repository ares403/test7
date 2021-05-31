package com.miniswing.svcservice.service;

import com.miniswing.svcservice.domain.Svc;
import com.miniswing.svcservice.domain.SvcRepository;
import com.miniswing.svcservice.web.dto.SvcListResponseDto;
import com.miniswing.svcservice.web.dto.SvcResponseDto;
import com.miniswing.svcservice.web.dto.SvcSaveRequestDto;
import com.miniswing.svcservice.web.dto.SvcUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SvcService {
    private final SvcRepository svcRepository;

    @Transactional
    public void save(SvcSaveRequestDto requestDto) {
        svcRepository.save(requestDto.toEntity()).getSvcmgmtnum();
    }

    @Transactional
    public void update(Long id, SvcUpdateRequestDto requestDto) {
        Svc svc = svcRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        svc.update(requestDto.getFeeprodid(), requestDto.getCustnum());

    }

    @Transactional
    public void delete (Long id) {
        Svc svc = svcRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        svcRepository.delete(svc);
    }

    @Transactional(readOnly = true)
    public SvcResponseDto findBySvcmgmtnum(Long svcmgmtnum) {
        Svc entity = svcRepository.findById(svcmgmtnum)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + svcmgmtnum));

        return new SvcResponseDto(entity);
    }

//    @Transactional(readOnly = true)
//    public List<SvcListResponseDto> findAllDesc() {
//        return svcRepository.findAllDesc().stream()
//                .map(SvcListResponseDto::new)
//                .collect(Collectors.toList());
//    }
}
