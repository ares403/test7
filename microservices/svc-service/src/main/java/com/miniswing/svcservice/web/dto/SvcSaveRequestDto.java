package com.miniswing.svcservice.web.dto;

import com.miniswing.svcservice.domain.Svc;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SvcSaveRequestDto {
    private Long svcmgmtnum;
    private String feeprodid;
    private String custnum;

    @Builder
    public SvcSaveRequestDto(Long svcmgmtnum, String feeprodid, String custnum) {
        this.svcmgmtnum = svcmgmtnum;
        this.feeprodid = feeprodid;
        this.custnum = custnum;
    }

    public Svc toEntity() {
        return Svc.builder()
                .svcmgmtnum(svcmgmtnum)
                .feeprodid(feeprodid)
                .custnum(custnum)
                .build();
    }

}
