package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    private final PostRepository postRepository;

    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap) {
        final var posts = postRepository.getAllPosts();
        modelMap.put("posts", posts);
        return "home";
    }
}
