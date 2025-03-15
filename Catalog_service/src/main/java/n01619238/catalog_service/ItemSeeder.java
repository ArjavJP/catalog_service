package n01619238.catalog_service;


import n01619238.catalog_service.Model.Item;
import n01619238.catalog_service.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ItemSeeder implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public ItemSeeder(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(name -> itemRepository.save(new Item(null, name)));

        itemRepository.findAll().forEach(System.out::println);
    }
}
