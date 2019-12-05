package dubbo_service.service;

import dubbo_service.entity.UserAddress;

import java.util.List;

public interface OrderService {

    public List<UserAddress> initOrder(String userId);
}
