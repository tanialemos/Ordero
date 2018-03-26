package be.tlemos.api.orders;

import be.tlemos.domain.orders.Order;
import be.tlemos.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public List<OrderDto> showAllOrders(){
        List<OrderDto> orderDtos = new ArrayList<>();
        for(Order order : orderService.showAllExistingOrders()){
            orderDtos.add(mapper.mapOrderToDto(order));
        }
        return orderDtos;
    }

}
