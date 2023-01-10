package mall.domain;

import mall.domain.DeliveryStarted;
import mall.domain.DeliveryCompleted;
import mall.domain.DeliveryCancled;
import mall.domain.DeliveryCollected;
import mall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="DeliveryMgmt_table")
@Data

public class DeliveryMgmt  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String menu;
    
    
    
    
    
    private String deliveryStatus;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Long prodectId;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();



        DeliveryCancled deliveryCancled = new DeliveryCancled(this);
        deliveryCancled.publishAfterCommit();



        DeliveryCollected deliveryCollected = new DeliveryCollected(this);
        deliveryCollected.publishAfterCommit();

    }

    public static DeliveryMgmtRepository repository(){
        DeliveryMgmtRepository deliveryMgmtRepository = DeliveryApplication.applicationContext.getBean(DeliveryMgmtRepository.class);
        return deliveryMgmtRepository;
    }




    public static void deliverystart(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        DeliveryMgmt deliveryMgmt = new DeliveryMgmt();
        repository().save(deliveryMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(deliveryMgmt->{
            
            deliveryMgmt // do something
            repository().save(deliveryMgmt);


         });
        */

        
    }
    public static void deliveryCancle(OrderCancled orderCancled){

        /** Example 1:  new item 
        DeliveryMgmt deliveryMgmt = new DeliveryMgmt();
        repository().save(deliveryMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancled.get???()).ifPresent(deliveryMgmt->{
            
            deliveryMgmt // do something
            repository().save(deliveryMgmt);


         });
        */

        
    }


}
