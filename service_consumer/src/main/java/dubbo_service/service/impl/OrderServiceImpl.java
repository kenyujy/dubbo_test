package dubbo_service.service.impl;

import dubbo_service.entity.UserAddress;
import dubbo_service.service.OrderService;
import dubbo_service.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Reference //引用dubbo 服务
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        List<UserAddress> list= userService.getUserAddressList("id101");
        return list;
    }
}
