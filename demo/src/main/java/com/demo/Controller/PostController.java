package com.demo.Controller;

import com.demo.Payload.PostDTO;
import com.demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    //http://localhost:8080/api/posts
    @PostMapping
    public ResponseEntity<PostDTO>Save(PostDTO postDTO){
        PostDTO dto = postService.Save(postDTO);
        return new ResponseEntity<>(dto, HttpStatus.OK);

    }
}
