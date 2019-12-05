package dubbo_service.controller;

import dubbo_service.entity.UserAddress;
import dubbo_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ResponseBody
    @GetMapping("/getUserAddress")
    public List<UserAddress> getUserAddress(@RequestParam(value="id", required=false) Integer id){
        List<UserAddress> list= userService.getUserAddressList("id101");
        return list;
    }
}
