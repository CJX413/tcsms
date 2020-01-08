package com.example.tcsms.Dao;

import com.example.tcsms.Entity.OperationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface OperationLogDao extends JpaRepository<OperationLog,Integer>, JpaSpecificationExecutor<OperationLog>, Serializable {

}
