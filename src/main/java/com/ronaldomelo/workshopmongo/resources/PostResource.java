package com.ronaldomelo.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldomelo.workshopmongo.domain.Post;
import com.ronaldomelo.workshopmongo.services.PostService;

@RestController
@RequestMapping
public class PostResource {

	@Autowired
	private PostService service;



}
