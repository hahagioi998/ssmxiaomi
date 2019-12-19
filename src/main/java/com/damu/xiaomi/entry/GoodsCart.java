package com.damu.xiaomi.entry;

import java.util.Date;
import java.util.List;

public class GoodsCart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_cart.id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_cart.goods_id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_cart.buy_count
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    private Integer buyCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_cart.add_date
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    private Date addDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_cart.subtotal
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    private Double subtotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_cart.consumer_id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    private Integer consumerId;

    private List<GoodsImages> goodsImages;

    public List<GoodsImages> getGoodsImages() {
        return goodsImages;
    }

    public void setGoodsImages(List<GoodsImages> goodsImages) {
        this.goodsImages = goodsImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_cart.id
     *
     * @return the value of goods_cart.id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_cart.id
     *
     * @param id the value for goods_cart.id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_cart.goods_id
     *
     * @return the value of goods_cart.goods_id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_cart.goods_id
     *
     * @param goodsId the value for goods_cart.goods_id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_cart.buy_count
     *
     * @return the value of goods_cart.buy_count
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public Integer getBuyCount() {
        return buyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_cart.buy_count
     *
     * @param buyCount the value for goods_cart.buy_count
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_cart.add_date
     *
     * @return the value of goods_cart.add_date
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_cart.add_date
     *
     * @param addDate the value for goods_cart.add_date
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_cart.subtotal
     *
     * @return the value of goods_cart.subtotal
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_cart.subtotal
     *
     * @param subtotal the value for goods_cart.subtotal
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_cart.consumer_id
     *
     * @return the value of goods_cart.consumer_id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public Integer getConsumerId() {
        return consumerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_cart.consumer_id
     *
     * @param consumerId the value for goods_cart.consumer_id
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public GoodsCart(Integer goodsId, Integer buyCount, Date addDate, Double subtotal, Integer consumerId) {
        this.goodsId = goodsId;
        this.buyCount = buyCount;
        this.addDate = addDate;
        this.subtotal = subtotal;
        this.consumerId = consumerId;
    }

    @Override
    public String toString() {
        return "GoodsCart{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", buyCount=" + buyCount +
                ", addDate=" + addDate +
                ", subtotal=" + subtotal +
                ", consumerId=" + consumerId +
                '}';
    }
}