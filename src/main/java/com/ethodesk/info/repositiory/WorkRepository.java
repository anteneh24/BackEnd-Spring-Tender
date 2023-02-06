package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkRepository extends JpaRepository<Work, Integer>, JpaSpecificationExecutor<Work> {

}