package n01619238.catalog_service.repository;

import n01619238.catalog_service.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {
}
