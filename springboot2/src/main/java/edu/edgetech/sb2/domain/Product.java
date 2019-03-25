package edu.edgetech.sb2.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String productId;
    private String description;
    private String imageUrl;
    private BigDecimal price;
    private String  type;

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", productId='" + productId + '\'' +
				", description='" + description + '\'' +
				", type='" + type + '\'' +
				'}';
	}

	public Product(String productId, String description, String imageUrl, BigDecimal price ) {
        this.productId = productId;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.type = (int)(Math.random()*4)+"";
    }

    public Product() {
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = (int)(Math.random()*4)+"";
	}

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
