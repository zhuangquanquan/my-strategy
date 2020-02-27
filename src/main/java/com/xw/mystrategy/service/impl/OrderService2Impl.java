package com.xw.mystrategy.service.impl;

import com.xw.mystrategy.handler.AbstractHandler;
import com.xw.mystrategy.model.OrderDTO;
import com.xw.mystrategy.handler.HandlerContext;
import com.xw.mystrategy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 策略模式实现
 */
@Service
public class OrderService2Impl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }
}
