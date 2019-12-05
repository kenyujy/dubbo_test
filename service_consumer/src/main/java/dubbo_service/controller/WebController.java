package dubbo_service.controller;

import dubbo_service.entity.UserAddress;
import dubbo_service.service.OrderService;
import dubbo_service.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    OrderService orderService; //OrderService Impl 引用了Userservice

    @Reference //引用dubbo 服务
    UserService userService;

    @ResponseBody
    @GetMapping("/getUserAddress")
    public List<UserAddress> getUserAddress(@RequestParam(value="id", required=false) Integer id){
        List<UserAddress> list= userService.getUserAddressList("id101");
        return list;
    }

    @ResponseBody
    @GetMapping("/info")
    public String info(){
        return "service consumer";
    }
}
