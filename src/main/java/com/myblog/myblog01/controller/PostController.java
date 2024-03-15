package com.myblog.myblog01.controller;

import com.myblog.myblog01.payload.PostDto;
import com.myblog.myblog01.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //@PreAuthorize("hasRole('ADMIN')")//by adding this only admin can create post
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){                                  //@RequestBody -take json object and put in PostDto//dto used bcz of custom response send back

        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
    //get the post based on post id
//http://localhost:8080/api/posts/particular?id=1-  it will search for id 1//and if record is found it will give result //if not found throw a message record not found
   @GetMapping("/particular")
    public ResponseEntity<PostDto> getPostById(@RequestParam long id){//@RequestParam-
        PostDto dto = postService.getPostById(id);//supplying id no to this
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    //Handler method
    ////http://localhost:8080/api/posts?pageNo=0&pageSize=3&sortBy=title&sortDir=asc
    //required = false-means if we dont give page no/siz it takes default value
    @GetMapping
    public List<PostDto> getAllPosts(
            @RequestParam(name = "pageNo",required = false,defaultValue = "0") int pageNo,
            @RequestParam(name = "pageSize",required = false,defaultValue = "3") int pageSize,
            @RequestParam(name = "sortBy",required = false,defaultValue = "id") String sortBy,
            @RequestParam(name = "sortDir",required = false,defaultValue = "id") String sortDir
    ){
        List<PostDto> postDtos = postService.getAllPosts(pageNo,pageSize,sortBy,sortDir);
        return postDtos;//here not using response Entity                                                                                           //bcz by default response is 200.
    }

             //update operation
//    @PutMapping("/{id}")
//    public ResponseEntity<PostDto> updatePost(@PathVariable long id, @RequestBody PostDto postDto) {
//        PostDto updatedDto = postService.updatePost(id, postDto);
//        return new ResponseEntity<>(updatedDto, HttpStatus.OK);
//    }


             //delete operation
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deletePost(@PathVariable long id) {
//        postService.deletePost(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
