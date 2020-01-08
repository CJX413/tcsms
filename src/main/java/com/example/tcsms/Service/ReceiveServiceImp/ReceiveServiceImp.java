package com.example.tcsms.Service.ReceiveServiceImp;

import com.example.tcsms.Dao.OperationLogDao;
import com.example.tcsms.Entity.OperationLog;
import com.example.tcsms.Service.ReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiveServiceImp implements ReceiveService {
    @Autowired
    private OperationLogDao operationLogDao;
    @Autowired
    private RedisServiceImp redisServiceImp;
    public void receive(OperationLog operationLog) {
        redisServiceImp.getRedis().set(operationLog.getDeviceID(), operationLog.toString());
        operationLogDao.save(operationLog);
    }
}
