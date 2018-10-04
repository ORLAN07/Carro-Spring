/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.carro.controller;

import com.example.carro.model.Post;
import com.example.carro.repository.CommentRepository;
import com.example.carro.repository.PostRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author orlando.rubio
 */

@RestController
public class PostController {
    
    
    @Autowired
    PostRepository postRepository;
  
    @GetMapping("/posts")
    public Page<Post> getAllpost(Pageable pageable){
        return postRepository.findAll(pageable);
    }
    
    @PostMapping("/posts")
    public Post createPosts(@Valid @RequestBody Post post){
        return postRepository.save(post);
    }
}
