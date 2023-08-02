package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /*
    * DEFAULT --> read committed
    *

     */
    @Transactional(isolation = Isolation.DEFAULT)

    public void addTestProducts(){

        for(int i = 0; i <=10; i++) {
            productRepository.addProduct("Product" + i);
        }

    }

}
