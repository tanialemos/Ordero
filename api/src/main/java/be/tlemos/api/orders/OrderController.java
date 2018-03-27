package be.tlemos.api.orders;

import be.tlemos.domain.orders.Order;
import be.tlemos.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/orders")
public class OrderController {

    OrderService orderService;
    OrderMapper mapper;

    @Inject
    public OrderController(OrderService orderService, OrderMapper mapper) {
        this.orderService = orderService;
        this.mapper = mapper;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> showAllOrders(){
        List<OrderDto> orderDtos = new ArrayList<>();
        for(Order order : orderService.showAllExistingOrders()){
            orderDtos.add(mapper.mapOrderToDto(order));
        }
        return orderDtos;
    }

//    @PostMapping(path="new_order", produces = "application/json", consumes = "application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public OrderDto createNewOrder(@RequestBody OrderDto orderDto){
//        orderService.createNewOrder(mapper.mapDtoToOrder(orderDto));
//        return orderDto;
//    }



}
