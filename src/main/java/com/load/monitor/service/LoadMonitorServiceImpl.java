package com.load.monitor.service;

import com.load.monitor.dto.LoadMonitoringDTO;
import com.load.monitor.dto.LogServiceDto;
import com.load.monitor.entity.LoadMonitor;
import com.load.monitor.repository.LoadMonitorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class LoadMonitorServiceImpl implements LoadMonitorService {

    private final LoadMonitorRepository loadMonitorRepository;

    @Override
    public void saveLog(LogServiceDto logService) {
        loadMonitorRepository.save(
                new LoadMonitor(
                        null,
                        logService.getNameService(),
                        logService.getNameNode(),
                        logService.getMemory(),
                        logService.getCpu(),
                        new Date()
                )
        );
    }

    @Override
    public List<LoadMonitoringDTO> loadMonitorsByNameService(String serviceName) {

//        return loadMonitorRepository.findLoadMonitorByNameService(serviceName)
//                .stream().map(LoadMonitoringDTO::new)
//                .collect(Collectors
//                        .toCollection(LinkedHashSet::new));
        // TODO
        /*
        * 1. Create new collection LoadMonitoringDTO
        * 2. loadMonitors collections foreach and convert  LoadMonitor to LoadMonitoringDTO and put element to new collection
        * 3. return new collection
        * */
        List<LoadMonitor> loadMonitors = loadMonitorRepository.findLoadMonitorByNameService(serviceName);
        List<LoadMonitoringDTO> loadMonitoringDTOList = new java.util.ArrayList<>(Collections.emptyList());
        for (LoadMonitor loadMonitor : loadMonitors) {
            loadMonitoringDTOList.add(convertLoadMonitorToDto(loadMonitor));
        }
        return loadMonitoringDTOList;
    }


    private LoadMonitoringDTO convertLoadMonitorToDto(final LoadMonitor loadMonitor) {
        return new LoadMonitoringDTO(
                loadMonitor.getNameService(),
                loadMonitor.getNameNode(),
                loadMonitor.getMemory(),
                loadMonitor.getCpu(),
                loadMonitor.getDataTime()
        );
    }
}
