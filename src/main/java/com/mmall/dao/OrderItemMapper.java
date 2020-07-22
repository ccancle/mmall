package com.mmall.dao;

import com.mmall.pojo.Order;
import com.mmall.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;
import sun.plugin.javascript.navig.LinkArray;

import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    List<OrderItem> getByOderNoUserId(@Param("orderNo")Long orderNo,@Param("userId")Integer userId);

    /**批量插入*/
    void batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);

    /**
     * 用户查询自己的订单
     */
    List<Order> selectByUserId(Integer userId);
}