package com.load.monitor.service;

import com.load.monitor.dto.LoadMonitoringDTO;
import com.load.monitor.dto.LogServiceDto;

import java.util.List;

public interface LoadMonitorService {
    void saveLog(final LogServiceDto logService);

    List<LoadMonitoringDTO> loadMonitorsByNameService(String serviceName);
}
