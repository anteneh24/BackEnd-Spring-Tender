package com.ethodesk.info.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "work")
public class Work implements Serializable {

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

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "work_name", nullable = false)
    private String workName;

    @Column(name = "level", nullable = false)
    private String level;

    @Column(name = "payment", nullable = false)
    private String payment;

    @Column(name = "work_no", nullable = false)
    private String workNo;

    @Column(name = "extra_skill", nullable = false)
    private String extraSkill;

    @Column(name = "work_experience", nullable = false)
    private String workExperience;

    @Column(name = "quantity", nullable = false)
    private String quantity;

    @Column(name = "learning_level", nullable = false)
    private String learningLevel;

    @Column(name = "until", nullable = false)
    private Date until;

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

    @Column(name = "submit_date", nullable = false)
    private Date submitDate;

    @Column(name = "aprove_id", nullable = false)
    private String aproveId;

    @Column(name = "aprove_date", nullable = false)
    private Date aproveDate;

    @Column(name = "remove", nullable = false)
    private String remove;

    @Column(name = "remove_date", nullable = false)
    private Date removeDate;

    @Column(name = "remove_id", nullable = false)
    private String removeId;

    @Column(name = "aprove", nullable = false)
    private String aprove;

    @Column(name = "byWhom", nullable = false)
    private String byWhom;

}
