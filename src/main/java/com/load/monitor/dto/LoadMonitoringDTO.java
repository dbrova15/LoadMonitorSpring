package com.load.monitor.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.xml.transform.sax.SAXResult;
import java.util.Date;

@Getter
@AllArgsConstructor
public class LoadMonitoringDTO {
    private String nameService;
    private String nameNode;
    private String memory;
    private String cpu;
    private Date dataTime;
}
