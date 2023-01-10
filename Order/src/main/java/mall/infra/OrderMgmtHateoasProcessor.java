package mall.infra;
import mall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderMgmtHateoasProcessor implements RepresentationModelProcessor<EntityModel<OrderMgmt>>  {

    @Override
    public EntityModel<OrderMgmt> process(EntityModel<OrderMgmt> model) {

        
        return model;
    }
    
}