package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderTypeRepository extends JpaRepository<TenderType, Integer>, JpaSpecificationExecutor<TenderType> {

}