package sakura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sakura.dao.ProductDao;
import sakura.entity.Product;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    public void deleteProduct(int productId) {
        productDao.deleteProduct(productId);
    }

    public void addProduct(Product product){
        productDao.addProduct(product);
    }

    public void updateProduct(Product product){
        productDao.updateProduct(product);
    }
}