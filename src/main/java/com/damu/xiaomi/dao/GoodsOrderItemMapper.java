package com.damu.xiaomi.dao;

import com.damu.xiaomi.entry.GoodsOrderItem;
import com.damu.xiaomi.entry.GoodsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    long countByExample(GoodsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int deleteByExample(GoodsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int insert(GoodsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int insertSelective(GoodsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    List<GoodsOrderItem> selectByExample(GoodsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    GoodsOrderItem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") GoodsOrderItem record, @Param("example") GoodsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByExample(@Param("record") GoodsOrderItem record, @Param("example") GoodsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_order_item
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByPrimaryKey(GoodsOrderItem record);
}