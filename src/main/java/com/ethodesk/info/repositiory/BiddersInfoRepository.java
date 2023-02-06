package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.BiddersInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BiddersInfoRepository extends JpaRepository<BiddersInfo, Integer>, JpaSpecificationExecutor<BiddersInfo> {

}