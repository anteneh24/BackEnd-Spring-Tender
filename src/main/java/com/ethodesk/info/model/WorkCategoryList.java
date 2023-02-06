package com.ethodesk.info.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "work_category_list")
public class WorkCategoryList implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "work_id", nullable = false)
    private String workId;

    @Column(name = "work_type_id", nullable = false)
    private String workTypeId;

}
