package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderCriteriaRepository extends JpaRepository<TenderCriteria, Integer>, JpaSpecificationExecutor<TenderCriteria> {

}