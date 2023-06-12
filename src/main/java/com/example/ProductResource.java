package com.example;

import com.example.request.Product;
import com.example.usecase.CreateProduct;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/products")
public class ProductResource {

    @Inject
    CreateProduct createProduct;

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createProduct(Product product) {
        return createProduct.createProduct(product);
    }

}
