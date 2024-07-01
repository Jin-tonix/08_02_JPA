package com.ohgiraffers.blog.jinhee.controller;

import com.ohgiraffers.blog.jinhee.model.dto.BlogDTO;
import com.ohgiraffers.blog.jinhee.service.JinheeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jinhee")
public class JinheeController {

    private final JinheeService jinheeService;

    @Autowired
    public JinheeController(JinheeService jinheeService) {
        this.jinheeService = jinheeService;
    }

    @GetMapping
    public String indexJinhee(){
        return "jinhee/page";
    }

    @PostMapping
    public ModelAndView postBlog(BlogDTO blogDTO, ModelAndView mv){

        if(blogDTO.getBlogTitle() == null || blogDTO.getBlogTitle().equals("")){
            mv.setViewName("redirect:jinhee");
        }
        if(blogDTO.getBlogContent() == null || blogDTO.getBlogContent().equals("")){
            mv.setViewName("redirect:jinhee");
        }
        int result = jinheeService.post(blogDTO);
        if(result <= 0){
            mv.setViewName("error/page");
        }else{
            mv.setViewName("jinhee/page");
        }
        return mv;
    }
}
