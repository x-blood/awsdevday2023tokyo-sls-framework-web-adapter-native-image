package com.example.usecase;

import com.example.dao.ProductDao;
import com.example.request.Product;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CreateProduct {
  @Inject
  ProductDao productDao;

  public String createProduct(Product product) {
    try {
      productDao.putProduct(product);
      return "Product with id = " + product.id + " created";
    } catch (Exception e) {
      e.printStackTrace();
      return "Internal Server Error";
    }
  }
}
