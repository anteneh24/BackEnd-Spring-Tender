package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderListDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderListDetailRepository extends JpaRepository<TenderListDetail, Integer>, JpaSpecificationExecutor<TenderListDetail> {

}