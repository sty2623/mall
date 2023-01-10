package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;
    private String menu;
    private String orderStatus;
    private Long orderId;
    private String address;
}


