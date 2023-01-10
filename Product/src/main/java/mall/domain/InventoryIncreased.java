package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private String menu;
    private String inventory;
    private String prodectNm;
    private Long prodectId;
    private String prodectImage;
    private String stop;

    public InventoryIncreased(Inventory aggregate){
        super(aggregate);
    }
    public InventoryIncreased(){
        super();
    }
}
