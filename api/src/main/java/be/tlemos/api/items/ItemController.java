package be.tlemos.api.items;

import be.tlemos.domain.items.Item;
import be.tlemos.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

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
        List<ItemDto> itemDtoList = new ArrayList<>();
        for (Item item : itemService.getAllItemsInStock()){
            itemDtoList.add(mapper.mapItemToDto(item));
        }
        return itemDtoList;
    }

    @PostMapping(path="/new_item", produces = "application/json", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDto addNewItemToStock(@RequestBody ItemDto itemDto){
        itemService.addNewItem(mapper.mapDtoToItem(itemDto));
        return itemDto;
    }
}
