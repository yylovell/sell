package com.yy.sell.repository;

import com.yy.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");

        productInfo.setProductName("面包");
        productInfo.setProductPrice(new BigDecimal(2.3));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃");
        productInfo.setProductIcon("http://www.yylovell.cn/1.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo res = productInfoRepository.save(productInfo);

        Assert.assertNotNull(res);
    }

    @Test
    public void findByProductStatusTest() {

        List<ProductInfo> productInfo = productInfoRepository.findByProductStatus(0);

        Assert.assertNotEquals(0, productInfo.size());
    }
}