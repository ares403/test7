package com.miniswing.svcservice.web.dto;

import com.miniswing.svcservice.domain.Svc;
import lombok.Getter;

@Getter
public class SvcResponseDto {
    private Long svcmgmtnum;
    private String feeprodid;
    private String custnum;

    public SvcResponseDto(Svc entity) {
        this.svcmgmtnum = entity.getSvcmgmtnum();
        this.feeprodid = entity.getFeeprodid();
        this.custnum = entity.getCustnum();
    }
}
