package com.example.sbdeploy;

import com.example.sbdeploy.controller.MainController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbDeployApplicationTests {
    @Autowired
    MainController mainController;

    @Test
    void HelloShouldReturnHelloWorld() {

        String str = mainController.Hello();
        String expStr = "Hello world!";

        Assertions.assertEquals(expStr, str);
    }

}
