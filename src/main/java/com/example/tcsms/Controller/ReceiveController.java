package com.example.tcsms.Controller;


import com.example.tcsms.Config.ConstantConfig;
import com.example.tcsms.Entity.OperationLog;
import com.example.tcsms.Service.ReceiveServiceImp.ReceiveServiceImp;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;


@RestController
@Log4j2
public class ReceiveController {
    @Autowired
    ReceiveServiceImp receiveService;

    @RequestMapping(value = "/json", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String receiveData(@RequestBody String json) throws ParseException {
        Gson gson = new Gson();
        OperationLog receiveEntity = gson.fromJson(json, OperationLog.class);
        BigDecimal radius = new BigDecimal(receiveEntity.getRadius());
        BigDecimal weight = new BigDecimal(receiveEntity.getWeight());
        BigDecimal torque = radius.multiply(weight).multiply(new BigDecimal(ConstantConfig.G));
        double Torque = torque.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        receiveEntity.setTorque(Torque);
        log.info(receiveEntity.getTime() + "Time");
        long date = Long.valueOf(receiveEntity.getTime());
        log.info(new Date().getTime() - date);
        receiveService.receive(receiveEntity);
        return "0";
    }

}
