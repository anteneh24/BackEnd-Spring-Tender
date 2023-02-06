package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LoginRepository extends JpaRepository<Login, Integer>, JpaSpecificationExecutor<Login> {

}