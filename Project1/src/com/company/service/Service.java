package com.company.service;

import com.company.entity.EmployeeEntity;
import com.company.entity.UserEntity;
import com.company.repository.ConnectDB;
import com.company.repository.UserRepo;

import java.util.List;

public class Service {
    private Service() {}
    private static Service service = new Service();
    public static Service getInstance() {
        return service;
    }
    public List<UserEntity> report() throws Exception {
        List<UserEntity> entities;
        try (UserRepo repository = new UserRepo()) {
            entities = repository.selectuser();
        }
        return entities;
    }
}
