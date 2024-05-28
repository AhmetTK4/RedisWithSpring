package com.cahing.redis.repository;

import com.cahing.redis.entitiy.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, String> {
}
