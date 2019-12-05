package dubbo_service.service;

import dubbo_service.entity.UserAddress;

import java.util.List;


public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);
}
