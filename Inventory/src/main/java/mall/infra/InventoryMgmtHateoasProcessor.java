package mall.infra;
import mall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class InventoryMgmtHateoasProcessor implements RepresentationModelProcessor<EntityModel<InventoryMgmt>>  {

    @Override
    public EntityModel<InventoryMgmt> process(EntityModel<InventoryMgmt> model) {

        
        return model;
    }
    
}
