package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.WorkSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkSubcategoryRepository extends JpaRepository<WorkSubcategory, Integer>, JpaSpecificationExecutor<WorkSubcategory> {

}