package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.WorkerAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WorkerAdminRepository extends JpaRepository<WorkerAdmin, Integer>, JpaSpecificationExecutor<WorkerAdmin> {

}