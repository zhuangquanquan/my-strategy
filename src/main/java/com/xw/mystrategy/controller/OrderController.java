package com.xw.mystrategy.controller;

import com.xw.mystrategy.model.OrderDTO;
import com.xw.mystrategy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("/test/{id}")
    public String findPath(@PathVariable("id") String id) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setType(id);
        String result = orderService.handle(orderDTO);
        return result;
    }
}
