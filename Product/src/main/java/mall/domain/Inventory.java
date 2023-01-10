package mall.domain;

import mall.domain.InventoryIncreased;
import mall.domain.InventoryDecreased;
import mall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {


    
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

    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = ProductApplication.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }




    public static void inventoryIncrease(DeliveryCompleted deliveryCompleted){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }
    public static void inventoryDecrease(DeliveryCollected deliveryCollected){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCollected.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }


}
