package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.WorkCategoryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkCategoryListRepository extends JpaRepository<WorkCategoryList, Integer>, JpaSpecificationExecutor<WorkCategoryList> {

}