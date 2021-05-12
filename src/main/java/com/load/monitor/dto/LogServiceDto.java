package com.load.monitor.dto;

/*
{
  "nameService": "serv",
  "nameNode": "node",
  "memory": "4000.12",
  "cpu": "34900"
}
 */

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class LogServiceDto {
    private final String nameService;
    private final String nameNode;
    private final String memory;
    private final String cpu;

    @JsonCreator
    public LogServiceDto(
            @JsonProperty("nameService") String nameService,
            @JsonProperty("nameNode") String nameNode,
            @JsonProperty("memory") String memory,
            @JsonProperty("cpu") String cpu
    ) {
        this.nameService = nameService;
        this.nameNode = nameNode;
        this.memory = memory;
        this.cpu = cpu;
    }
}
