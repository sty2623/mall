package mall.domain;

import mall.domain.InventoryIncreased;
import mall.domain.InventoryDecreased;
import mall.InventoryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="InventoryMgmt_table")
@Data

public class InventoryMgmt  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String menu;
    
    
    
    
    
    private String inventory;
    
    
    
    
    
    private String prodectNm;
    
    
    
    
    
    private Long prodectId;
    
    
    
    
    
    private String prodectImage;
    
    
    
    
    
    private String stop;

    @PostPersist
    public void onPostPersist(){


        InventoryIncreased inventoryIncreased = new InventoryIncreased(this);
        inventoryIncreased.publishAfterCommit();



        InventoryDecreased inventoryDecreased = new InventoryDecreased(this);
        inventoryDecreased.publishAfterCommit();

    }

    public static InventoryMgmtRepository repository(){
        InventoryMgmtRepository inventoryMgmtRepository = InventoryApplication.applicationContext.getBean(InventoryMgmtRepository.class);
        return inventoryMgmtRepository;
    }




    public static void inventoryIncrease(DeliveryCompleted deliveryCompleted){

        /** Example 1:  new item 
        InventoryMgmt inventoryMgmt = new InventoryMgmt();
        repository().save(inventoryMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(inventoryMgmt->{
            
            inventoryMgmt // do something
            repository().save(inventoryMgmt);


         });
        */

        
    }
    public static void inventoryDecrease(DeliveryCollected deliveryCollected){

        /** Example 1:  new item 
        InventoryMgmt inventoryMgmt = new InventoryMgmt();
        repository().save(inventoryMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCollected.get???()).ifPresent(inventoryMgmt->{
            
            inventoryMgmt // do something
            repository().save(inventoryMgmt);


         });
        */

        
    }


}
