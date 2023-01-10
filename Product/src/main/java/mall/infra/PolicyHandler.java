package mall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import mall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import mall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired InventoryRepository inventoryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCompleted'")
    public void wheneverDeliveryCompleted_InventoryIncrease(@Payload DeliveryCompleted deliveryCompleted){

        DeliveryCompleted event = deliveryCompleted;
        System.out.println("\n\n##### listener InventoryIncrease : " + deliveryCompleted + "\n\n");


        

        // Sample Logic //
        Inventory.inventoryIncrease(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCollected'")
    public void wheneverDeliveryCollected_InventoryDecrease(@Payload DeliveryCollected deliveryCollected){

        DeliveryCollected event = deliveryCollected;
        System.out.println("\n\n##### listener InventoryDecrease : " + deliveryCollected + "\n\n");


        

        // Sample Logic //
        Inventory.inventoryDecrease(event);
        

        

    }

}


