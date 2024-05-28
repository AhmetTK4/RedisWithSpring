package com.cahing.redis.entitiy;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Customer")
public class Customer implements Serializable {

    @Id
    private String id;

    private String name;
    public Customer(String id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}
