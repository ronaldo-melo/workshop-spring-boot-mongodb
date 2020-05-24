package com.ronaldomelo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ronaldomelo.workshopmongo.domain.Post;

public interface PostRepository  extends MongoRepository<Post, String>{

}
