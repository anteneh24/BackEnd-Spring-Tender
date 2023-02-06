package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderListRepository extends JpaRepository<TenderList, Integer>, JpaSpecificationExecutor<TenderList> {

}