package com.example.tcsms.Service.ReceiveServiceImp;

import com.example.tcsms.Dao.DeviceRegistryDao;
import com.example.tcsms.Entity.DeviceRegistry;
import com.example.tcsms.Service.DeviceRegistryService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.tcsms.Config.ConstantConfig.REGISTRY_KEY;

@Log4j2
@Service
public class DeviceRegistryServiceImp implements DeviceRegistryService {
    @Autowired
    DeviceRegistryDao deviceRegistryDao;
    @Autowired
    RedisServiceImp redisServiceImp;

    public int deviceRegister(DeviceRegistry deviceRegistry) {
        if (deviceRegistryDao.deviceRegister(deviceRegistry) > 0) {
            redisServiceImp.getRedis().set(deviceRegistry.getDeviceId() + REGISTRY_KEY, deviceRegistry.getIsRegistered());
            return 1;
        }
        return 0;
    }

    public int updateDeviceRegistry(DeviceRegistry deviceRegistry) {
        return deviceRegistryDao.update(deviceRegistry);
    }

}
