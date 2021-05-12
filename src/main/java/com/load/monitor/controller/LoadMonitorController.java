package com.load.monitor.controller;

import com.load.monitor.dto.LoadMonitoringDTO;
import com.load.monitor.dto.LogServiceDto;
import com.load.monitor.service.LoadMonitorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
{
  "nameService": "serv",
  "nameNode": "node",
  "memory": "4000.12",
  "cpu": "34900"
}
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/monitor")
public class LoadMonitorController {

    private final LoadMonitorService loadMonitorService;

    @PostMapping("/save/log")
    public void saveLog(@RequestBody final LogServiceDto logService) {
        loadMonitorService.saveLog(logService);
    }

    @GetMapping("/load/name")
    public List<LoadMonitoringDTO> loadMonitorByNameService(@RequestParam(name = "serviceName") String serviceName) {
        return loadMonitorService.loadMonitorsByNameService(serviceName);
    }

}
