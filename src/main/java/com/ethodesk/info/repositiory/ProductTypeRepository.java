package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductTypeRepository extends JpaRepository<ProductType, Integer>, JpaSpecificationExecutor<ProductType> {

}