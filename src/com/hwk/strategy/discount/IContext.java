package com.hwk.strategy.discount;

import com.hwk.strategy.sales.IOrder;

public interface IContext {
    void setDiscountStrategy(IDiscount discountStrategy);
    float calculateDiscount(IOrder order);
}
