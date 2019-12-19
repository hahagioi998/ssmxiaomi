package com.damu.xiaomi.dao;

import com.damu.xiaomi.entry.GoodsShippingAddress;
import com.damu.xiaomi.entry.GoodsShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShippingAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    long countByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int deleteByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int insert(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int insertSelective(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    List<GoodsShippingAddress> selectByExampleWithBLOBs(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    List<GoodsShippingAddress> selectByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    GoodsShippingAddress selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByExample(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByPrimaryKey(GoodsShippingAddress record);
}