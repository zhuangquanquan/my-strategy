package com.xw.mystrategy.handler;

import com.xw.mystrategy.model.OrderDTO;

public abstract class AbstractHandler {

    public abstract String handle(OrderDTO dto);
}
