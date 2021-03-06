package com.xw.mystrategy.handler.biz;

import com.xw.mystrategy.handler.AbstractHandler;
import com.xw.mystrategy.handler.HandlerType;
import com.xw.mystrategy.model.OrderDTO;
import org.springframework.stereotype.Component;

@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }
}
