package com.mmall.dao;

import com.google.common.collect.Lists;
import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //根据UserId ProductId查询购物车
    Cart selectCartByUserIdProductId(@Param("userId") Integer userId,@Param("productId") Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    //查看购物车中是否是全选
    int selectCartProductCheckedStatusByUserId(Integer userId);

    //返回删除行数
    int deleteByUserIdProductIds(@Param("userId") Integer userId,@Param("productIdList") List<String> productIdList);

    //选择 不选
    int checkedOrUncheckedProduct(@Param("userId") Integer userId,@Param("productId") Integer productId,@Param("checked") Integer checked);

    int selectCartProductCount(Integer userId);

    //根据用户查询购物车中勾选的商品信息  返回商品集合
    List<Cart> selectCheckedCartByUserId(Integer userId);
}