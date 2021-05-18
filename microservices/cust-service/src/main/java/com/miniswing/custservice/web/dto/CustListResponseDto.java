package com.miniswing.custservice.web.dto;

import com.miniswing.custservice.domain.Cust;
import lombok.Getter;

@Getter
public class CustListResponseDto {
    private String custnum;
    private String custnm;
    private String anctnum;

    public CustListResponseDto(Cust entity) {
        this.custnum = entity.getCustnum();
        this.custnm = entity.getCustnm();
        this.anctnum = entity.getAcntnum();
    }
}
