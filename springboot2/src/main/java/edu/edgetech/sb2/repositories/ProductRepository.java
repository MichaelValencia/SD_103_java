package edu.edgetech.sb2.repositories;

import edu.edgetech.sb2.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Edge Tech Academy on 11/22/2016.
 */

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByType(String type);
}
