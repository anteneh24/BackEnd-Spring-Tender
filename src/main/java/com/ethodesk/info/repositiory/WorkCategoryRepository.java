package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.WorkCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkCategoryRepository extends JpaRepository<WorkCategory, Integer>, JpaSpecificationExecutor<WorkCategory> {

}