package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkersRepository extends JpaRepository<Workers, Integer>, JpaSpecificationExecutor<Workers> {

}