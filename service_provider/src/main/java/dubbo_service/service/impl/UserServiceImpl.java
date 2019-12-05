package dubbo_service.service.impl;

import dubbo_service.entity.UserAddress;
import dubbo_service.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Service //注册dubbo 服务
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId){
        UserAddress userAddress1= new UserAddress(1,"id101",
                "某地某街101号","收件人1","1365657709",true);

        UserAddress userAddress2= new UserAddress(2,"id102",
                "某地某街102号","收件人2","1395857325",true);

        return Arrays.asList(userAddress1, userAddress2);
    }
}
