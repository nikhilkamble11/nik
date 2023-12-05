package com.demo.Service;

import com.demo.Entities.Post;
import com.demo.Payload.PostDTO;
import com.demo.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    
    
    public PostDTO Save(PostDTO postDTO){
        Post post =new Post();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());

        Post newPost = postRepository.save(post);

        PostDTO DTO =new PostDTO();
        DTO.setId(newPost.getPostId());
        DTO.setTitle(newPost.getTitle());
        DTO.setDescription(newPost.getDescription());

        return DTO;
    }
    
}
