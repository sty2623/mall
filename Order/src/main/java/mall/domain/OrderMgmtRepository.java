package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="orderMgmts", path="orderMgmts")
public interface OrderMgmtRepository extends PagingAndSortingRepository<OrderMgmt, Long>{

}
