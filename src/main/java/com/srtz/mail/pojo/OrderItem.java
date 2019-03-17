package com.srtz.mail.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem {
    private Integer id;

    private Long orderNumber;

    private Integer userId;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal productInitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Date createTime;

    private Date updateTime;

    public OrderItem(Integer id, Long orderNumber, Integer userId, Integer productId, String productName, String productImage, BigDecimal productInitPrice, Integer quantity, BigDecimal totalPrice, Date createTime, Date updateTime) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.productImage = productImage;
        this.productInitPrice = productInitPrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OrderItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage == null ? null : productImage.trim();
    }

    public BigDecimal getProductInitPrice() {
        return productInitPrice;
    }

    public void setProductInitPrice(BigDecimal productInitPrice) {
        this.productInitPrice = productInitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}