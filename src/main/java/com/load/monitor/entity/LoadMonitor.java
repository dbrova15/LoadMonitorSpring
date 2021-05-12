package com.load.monitor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "load_monitor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoadMonitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer loadMonitorId;
    @Column(name = "name_service", nullable = false)
    private String nameService;
    @Column(name = "name_node", nullable = false)
    private String nameNode;
    @Column(name = "memory", nullable = false)
    private String memory;
    @Column(name = "cpu", nullable = false)
    private String cpu;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_time", nullable = false)
    private Date dataTime;
}
