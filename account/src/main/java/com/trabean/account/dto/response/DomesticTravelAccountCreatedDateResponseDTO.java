package com.trabean.account.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DomesticTravelAccountCreatedDateResponseDTO {

    @JsonProperty("accountCreatedDate")
    private String accountCreatedDate;
}
