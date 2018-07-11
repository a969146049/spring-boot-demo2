package org.java.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 18/7/9.
 */
@RestController
public class DemoController {
        @RequestMapping(value = "hi")
        public String sayHi(){
            return  "Hellor Spring Boot";
        }
}
