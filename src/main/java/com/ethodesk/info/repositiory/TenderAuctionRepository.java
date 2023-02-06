package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderAuction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderAuctionRepository extends JpaRepository<TenderAuction, Integer>, JpaSpecificationExecutor<TenderAuction> {

}