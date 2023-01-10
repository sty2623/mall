package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCollected extends AbstractEvent {

    private Long id;
    private String menu;
    private String deliveryStatus;
    private Long orderId;
    private Long prodectId;
    private String address;

    public DeliveryCollected(DeliveryMgmt aggregate){
        super(aggregate);
    }
    public DeliveryCollected(){
        super();
    }
}
