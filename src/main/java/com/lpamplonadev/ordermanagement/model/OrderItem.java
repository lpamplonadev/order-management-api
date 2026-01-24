package com.lpamplonadev.ordermanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_items", uniqueConstraints = {
  @UniqueConstraint(name = "uk_order_item_order_product", columnNames = {"order_id", "product_id"})
})
public class OrderItem {

  @Id
  @GeneratedValue
  private UUID id;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "order_id", nullable = false,
      foreignKey = @ForeignKey(name = "fk_order_item_order"))
  private Order order;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "product_id", nullable = false,
      foreignKey = @ForeignKey(name = "fk_order_item_product"))
  private Product product;

  @Column(nullable = false)
  private int quantity;

  @Column(nullable = false, precision = 12, scale = 2)
  private BigDecimal unitPrice;

  @Column(nullable = false, precision = 12, scale = 2)
  private BigDecimal subtotal;

  @PrePersist
  void onCreate() {
    if (this.subtotal == null && this.unitPrice != null) {
      this.subtotal = this.unitPrice.multiply(BigDecimal.valueOf(this.quantity));
    }
  }
}