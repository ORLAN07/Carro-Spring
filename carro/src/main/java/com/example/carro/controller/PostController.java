/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.carro.controller;

import com.example.carro.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author orlando.rubio
 */

@RestController
public class PostController {
    
    
    @Autowired
    PostRepository postRepository;
    
    
}
