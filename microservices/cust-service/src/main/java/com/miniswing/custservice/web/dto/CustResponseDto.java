package com.miniswing.custservice.web.dto;

import com.miniswing.custservice.domain.Cust;
import lombok.Getter;

@Getter
public class CustResponseDto {
    private String custnum;
    private String custnm;
    private String acntnum;

    public CustResponseDto(Cust entity) {
        this.custnum = entity.getCustnum();
        this.custnm = entity.getCustnm();
        this.acntnum = entity.getAcntnum();
    }
}
