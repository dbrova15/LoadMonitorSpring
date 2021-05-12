package com.load.monitor.repository;

import com.load.monitor.entity.LoadMonitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoadMonitorRepository extends JpaRepository<LoadMonitor, Integer> {
    List<LoadMonitor> findLoadMonitorByNameService(String nameService);
}
