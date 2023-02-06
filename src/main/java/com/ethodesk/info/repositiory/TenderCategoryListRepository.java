package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderCategoryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderCategoryListRepository extends JpaRepository<TenderCategoryList, Integer>, JpaSpecificationExecutor<TenderCategoryList> {

}