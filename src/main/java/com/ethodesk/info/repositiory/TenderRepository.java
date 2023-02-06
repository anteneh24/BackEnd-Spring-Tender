package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.Tender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderRepository extends JpaRepository<Tender, Integer>, JpaSpecificationExecutor<Tender> {

}