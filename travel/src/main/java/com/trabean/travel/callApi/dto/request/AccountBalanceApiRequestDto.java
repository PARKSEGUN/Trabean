package com.trabean.travel.callApi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trabean.util.RequestHeader;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AccountBalanceApiRequestDto {

    @JsonProperty("Header")
    private RequestHeader header;
    private String accountNo;

}
