package com.mmall.vo;

import com.alipay.api.domain.ItemOrderVO;
import com.alipay.api.domain.OrderItem;

import java.awt.event.ItemEvent;
import java.math.BigDecimal;
import java.util.List;

/**
 * @program: mmall
 * @description:
 * @author: Macchac
 * @create: 2020-07-21 18:08
 **/
public class OrderProductVo {
    private List<OrderItemVo> orderItemVoList;
    private BigDecimal productTotalPrice;
    private String imageHost;

    public List<OrderItemVo> getOrderItemVoList() {
        return orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
