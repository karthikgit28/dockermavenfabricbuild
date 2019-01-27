package com.docker.maven.dockermavenintegrate.services;

import java.util.List;

import com.docker.maven.dockermavenintegrate.commands.ProductForm;
import com.docker.maven.dockermavenintegrate.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
