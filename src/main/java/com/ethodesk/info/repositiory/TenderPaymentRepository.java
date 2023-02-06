package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderPaymentRepository extends JpaRepository<TenderPayment, Integer>, JpaSpecificationExecutor<TenderPayment> {

}