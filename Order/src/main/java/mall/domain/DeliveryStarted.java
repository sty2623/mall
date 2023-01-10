package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String menu;
    private String deliveryStatus;
    private Long orderId;
    private Long prodectId;
    private String address;
}


