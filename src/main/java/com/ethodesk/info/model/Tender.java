package com.ethodesk.info.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "tender")
public class Tender implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "source", nullable = false)
    private String source;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "tender_no", nullable = false)
    private String tenderNo;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "phone_no", nullable = false)
    private String phoneNo;

    @Column(name = "website", nullable = false)
    private String website;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "pobox", nullable = false)
    private String pobox;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "opening_date", nullable = false)
    private String openingDate;

    @Column(name = "closing_date", nullable = false)
    private String closingDate;

    @Column(name = "submit_date", nullable = false)
    private Date submitDate;

    @Column(name = "free", nullable = false)
    private String free;

    @Column(name = "aprove_id", nullable = false)
    private String aproveId;

    @Column(name = "aprove_date", nullable = false)
    private Date aproveDate;

    @Column(name = "auction", nullable = false)
    private String auction;

    @Column(name = "remove", nullable = false)
    private String remove;

    @Column(name = "byWhom", nullable = false)
    private String byWhom;

}
