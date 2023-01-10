package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="inventoryMgmts", path="inventoryMgmts")
public interface InventoryMgmtRepository extends PagingAndSortingRepository<InventoryMgmt, Long>{

}
