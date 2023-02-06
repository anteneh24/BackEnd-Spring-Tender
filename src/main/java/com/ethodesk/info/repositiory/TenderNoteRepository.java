package com.ethodesk.info.repositiory;

import com.ethodesk.info.model.TenderNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TenderNoteRepository extends JpaRepository<TenderNote, Integer>, JpaSpecificationExecutor<TenderNote> {

}