package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.Registor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegistorRepository extends JpaRepository<Registor, Integer>, JpaSpecificationExecutor<Registor> {

}