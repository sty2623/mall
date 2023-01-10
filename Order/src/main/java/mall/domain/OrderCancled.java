package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;
    private String menu;
    private String orderStatus;
    private Long orderId;
    private String address;

    public OrderCancled(OrderMgmt aggregate){
        super(aggregate);
    }
    public OrderCancled(){
        super();
    }
}
