package com.example.tcsms.Service;

import com.example.tcsms.Dao.DeviceRegistryDao;
import com.example.tcsms.Entity.DeviceRegistry;

import java.util.List;

public interface DeviceRegistryService {
    int deviceRegister(DeviceRegistry deviceRegistry);
    int updateDeviceRegistry(DeviceRegistry deviceRegistry);
}
