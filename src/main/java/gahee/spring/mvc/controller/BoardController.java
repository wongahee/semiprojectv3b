package gahee.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board/list")
    public String list(){
        return "list.tiles";
    }

    @GetMapping("/board/view")
    public String view(){
        return "view.tiles";
    }

    @GetMapping("/board/write")
    public String write(){
        return "write.tiles";
    }

}
