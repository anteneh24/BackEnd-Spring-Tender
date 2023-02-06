package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.WorkCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkCriteriaRepository extends JpaRepository<WorkCriteria, Integer>, JpaSpecificationExecutor<WorkCriteria> {

}