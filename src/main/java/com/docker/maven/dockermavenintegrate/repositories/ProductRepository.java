package com.docker.maven.dockermavenintegrate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.docker.maven.dockermavenintegrate.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
