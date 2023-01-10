package mall.domain;

import mall.domain.OrderPlaced;
import mall.domain.OrderCancled;
import mall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderMgmt_table")
@Data

public class OrderMgmt  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String menu;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String orderStatus;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OrderCancled orderCancled = new OrderCancled(this);
        orderCancled.publishAfterCommit();

    }

    public static OrderMgmtRepository repository(){
        OrderMgmtRepository orderMgmtRepository = OrderApplication.applicationContext.getBean(OrderMgmtRepository.class);
        return orderMgmtRepository;
    }




    public static void updateStatus(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

        
    }
    public static void updateStatus(DeliveryCollected deliveryCollected){

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCollected.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

        
    }
    public static void updateStatus(DeliveryCancled deliveryCancled){

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCancled.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

        
    }
    public static void updateStatus(DeliveryCompleted deliveryCompleted){

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

        
    }


}
