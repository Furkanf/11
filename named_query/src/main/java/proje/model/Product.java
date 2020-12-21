package proje.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name="Product.findProducts", query = "select p from Product p"),
        @NamedQuery(name="Product.findById", query = "select p from Product p where p.productId = :productId"),
        @NamedQuery(name="Product.findByCategoryName", query = "select p from Product p where p.category.name = :name"),
        @NamedQuery(name="Product.findCount", query = "select count(p) from Product p"),
        })

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name;

    private double unitPrice;

    private int available;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;

    @Temporal(TemporalType.TIMESTAMP)
    private Date addDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", available=" + available +
                ", addDate=" + addDate +
                '}';
    }

    public Product(String name, double unitPrice, int available, Brand brand, Category category, Date addDate) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.available = available;
        this.brand = brand;
        this.category = category;
        this.addDate = addDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
