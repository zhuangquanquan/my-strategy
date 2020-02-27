package com.xw.mystrategy.handler.biz;

import com.xw.mystrategy.handler.AbstractHandler;
import com.xw.mystrategy.handler.HandlerType;
import com.xw.mystrategy.model.OrderDTO;
import org.springframework.stereotype.Component;

@Component
@HandlerType("3")
public class PromotionHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "处理促销订单";
    }
}
