package com.ethodesk.info.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tender_list")
public class TenderList implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tender_id", nullable = false)
    private String tenderId;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity", nullable = false)
    private String quantity;

    @Column(name = "detail", nullable = false)
    private String detail;

    @Column(name = "sequrity", nullable = false)
    private String sequrity;

}
