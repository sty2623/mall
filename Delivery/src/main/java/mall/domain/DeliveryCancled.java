package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCancled extends AbstractEvent {

    private Long id;
    private String menu;
    private String deliveryStatus;
    private Long orderId;
    private Long prodectId;
    private String address;

    public DeliveryCancled(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryCancled(){
        super();
    }
}
