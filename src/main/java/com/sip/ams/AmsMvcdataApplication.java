package com.sip.ams;

import java.io.File;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.ams.controllers.ArticleController;

@SpringBootApplication
public class AmsMvcdataApplication {

    public static void main(String[] args) {
	new File(ArticleController.uploadDirectory).mkdir();
	 
	SpringApplication.run(AmsMvcdataApplication.class, args);
    }

}
 