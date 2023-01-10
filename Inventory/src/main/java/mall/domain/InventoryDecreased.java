package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class InventoryDecreased extends AbstractEvent {

    private Long id;
    private String menu;
    private String inventory;
    private String prodectNm;
    private Long prodectId;
    private String prodectImage;
    private String stop;

    public InventoryDecreased(InventoryMgmt aggregate){
        super(aggregate);
    }
    public InventoryDecreased(){
        super();
    }
}
