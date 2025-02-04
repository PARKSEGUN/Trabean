package com.trabean.external.ssafy.api.foriegn.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trabean.external.ssafy.util.RequestHeader;
import lombok.Builder;
import lombok.Getter;

/**
 * SSAFY 금융 API p.235 - 외화 계좌 조회 (단건) requestDTO
 */
@Builder
@Getter
public class InquireForeignCurrencyDemandDepositAccountRequestDTO {

    @JsonProperty("Header")
    private RequestHeader header;

    @JsonProperty("accountNo")
    private String accountNo;
}
