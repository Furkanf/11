package com.proje.query;

public class query {

    public static final String findProducts = "SELECT p FROM Product p"; // Tüm productları çağırır.
    // : ile belirtilenler değişkendir onun yerine istediğimiz değişkenleri verebiliriz.
    public static final String findProductsById = "SELECT p FROM Product p Where p.productId = :productId"; // vereceğimiz productId'ye p.productId'leri eşit olan productları getir.
    public static final String findProductNames = "SELECT p.name FROM Product p"; // Tüm productların sadece isimlerini getir.
    public static final String findProductNamePrice = "SELECT p.name, p.unitPrice FROM Product p"; // Tüm productların isimlerini ve ücretlerini getirir.
    public static final String findGreatPrice = "SELECT p FROM Product p WHERE p.unitPrice > :unitPrice"; // UnitPrice'ı verdiğimiz değerden büyük olan productları getirir.
    public static final String findGreatLessPrice = "SELECT p FROM Product p WHERE p.unitPrice > :minUnitPrice AND p.unitPrice < :maxUnitPrice"; // UnitPrice'ı verdiğimiz aralıklarda olan productları getirir.
    public static final String findBetweenPrice = "SELECT p FROM Product p WHERE p.unitPrice BETWEEN :minUnitPrice AND :maxUnitPrice"; // UnitPrice'ı verdiğimiz aralıklarda olan productları getirir.
    public static final String findLikeProductName = "SELECT p FROM Product p WHERE p.name LIKE :productName"; // Verdiğimiz stringi barındıran ürünleri getirir.
    public static final String findInCategoryName = "SELECT p FROM Product p LEFT JOIN p.category c WHERE c.name IN(:categoryName1, :categoryName2)"; // Verdiğimiz iki stringi içeren ürünleri getirir.
    public static final String findFunctionPrice = "SELECT AVG(p.unitPrice), SUM(p.unitPrice), MAX(p.unitPrice), MIN(p.unitPrice), COUNT(p) FROM Product p"; // Aggregate fonksiyonları kullanabiliriz.
    public static final String findGroupByCategory = "SELECT p.category.categoryName, AVG(p.unitPrice) FROM Product p GROUP BY p.category.categoryName"; // İsme göre gruplandırır ve grupların ortalama fiyatı yazar.
    public static final String findOrderByPrice = "SELECT p FROM Product p ORDER BY p.unitPrice DESC"; //Tersten sıralama yapar.

}
