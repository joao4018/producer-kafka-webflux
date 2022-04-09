package com.webflux.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author joaocarlos
 */
@Getter
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String lastname;
    private Date birthday;

}
