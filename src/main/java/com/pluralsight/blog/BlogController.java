package com.pluralsight.blog;

import org.springframework.stereotype.Controller;

@Controller
public class BlogController {
    public String listPosts() {
        return "home";
    }
}
