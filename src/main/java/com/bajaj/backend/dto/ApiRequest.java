package com.bajaj.backend.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class ApiRequest {
    private Integer fibonacci;
    private List<Integer> prime;
    private List<Integer> lcm;
    private List<Integer> hcf;

    @JsonProperty("AI")
    @JsonAlias({ "ai", "Ai" })
    private String AI;
}
