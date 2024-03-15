package com.myblog.myblog01.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor//this take care of constructor based injection
@NoArgsConstructor
public class ErrorDetails {

    private String message;
    private Date date;
    private String uri;//help in tracking exception
}
