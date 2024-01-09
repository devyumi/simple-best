package com.example.simplebest.controller;

import com.example.simplebest.dto.BoardDto;
import com.example.simplebest.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("board")
public class BoardController {
    private BoardService boardService;

    @GetMapping()
    public String list(){
        return "board/list";
    }

    @GetMapping("write")
    public String write(){
        return "board/writeForm";
    }

    @PostMapping("wrtie")
    public String wrtie(BoardDto boardDto){
        boardService.savePost(boardDto);
        return "redirect:/";
    }
}
