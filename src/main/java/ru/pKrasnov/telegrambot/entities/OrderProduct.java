package ru.pKrasnov.telegrambot.entities;

import javax.persistence.*;

@Entity
public class OrderProduct {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private ClientOrder clientOrder;

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Long countProduct;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setClientOrder(ClientOrder clientOrder) {
        this.clientOrder = clientOrder;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public void setCountProduct(Long countProduct) {
        this.countProduct = countProduct;
    }

    public Long getCountProduct() {
        return countProduct;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
