package com.yy.sell.service.impl;

import com.yy.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfo> page = productService.findAll(pageRequest);
        System.out.println(page.getTotalElements());
    }
}