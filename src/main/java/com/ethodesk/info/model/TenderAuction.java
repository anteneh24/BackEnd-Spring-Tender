package com.ethodesk.info.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tender_auction")
public class TenderAuction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tender_id", nullable = false)
    private String tenderId;

    @Column(name = "borrower", nullable = false)
    private String borrower;

    @Column(name = "warranty", nullable = false)
    private String warranty;

    @Column(name = "branch", nullable = false)
    private String branch;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "map_no", nullable = false)
    private String mapNo;

    @Column(name = "boardnumber", nullable = false)
    private String boardnumber;

    @Column(name = "factory", nullable = false)
    private String factory;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "period", nullable = false)
    private String period;

    @Column(name = "motor", nullable = false)
    private String motor;

    @Column(name = "fueltype", nullable = false)
    private String fueltype;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "work", nullable = false)
    private String work;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "tplace", nullable = false)
    private String tplace;

    @Column(name = "start", nullable = false)
    private String start;

    @Column(name = "watch", nullable = false)
    private String watch;

}
