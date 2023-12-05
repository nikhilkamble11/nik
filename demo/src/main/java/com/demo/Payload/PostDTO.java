package com.demo.Payload;

import com.demo.Entities.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostDTO {

    private long id;
    private String title;
    private String description;


}
