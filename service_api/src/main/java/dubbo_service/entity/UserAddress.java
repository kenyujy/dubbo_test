package dubbo_service.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserAddress implements Serializable {

    private long id;
    private String userId;
    private String userAddress;
    private String consignee;
    private String phoneNum;
    private boolean isDefault;

    public UserAddress() {

    }

    public UserAddress(long id, String userId, String userAddress, String consignee, String phoneNum, boolean isDefault) {
        this.id = id;
        this.userId = userId;
        this.userAddress = userAddress;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }
}
