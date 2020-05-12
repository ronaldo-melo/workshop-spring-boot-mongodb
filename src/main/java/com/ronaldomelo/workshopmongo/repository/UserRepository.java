package com.ronaldomelo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ronaldomelo.workshopmongo.domain.User;

public interface UserRepository  extends MongoRepository<User, String>{

}
