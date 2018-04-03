package be.tlemos.api.items;

import be.tlemos.domain.items.Item;
import be.tlemos.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/items")
public class ItemController {

    ItemService itemService;
    ItemMapper mapper;

    @Inject
    public ItemController(ItemService itemService, ItemMapper mapper) {
        this.itemService = itemService;
        this.mapper = mapper;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<ItemDto> getAllItemsInStock(){
        List<Item> itemList = itemService.getAllItemsInStock();
        return itemList.stream()
                .map(x->mapper.mapItemToDto(x))
                .collect(Collectors.toList());
    }

    @PostMapping(path="/new_item", produces = "application/json", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDto addNewItemToStock(@RequestBody ItemDto itemDto){
        Item item = itemService.createNewItem(mapper.mapDtoToItem(itemDto));
        return mapper.mapItemToDto(item);
    }
}
