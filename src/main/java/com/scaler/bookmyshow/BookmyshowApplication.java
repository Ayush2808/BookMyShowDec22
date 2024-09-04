package com.scaler.bookmyshow;

import com.scaler.bookmyshow.Models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmyshowApplication {

    public static void main(String[] args) {
        BaseModel bs = new BaseModel();

        SpringApplication.run(BookmyshowApplication.class, args);
    }

}
