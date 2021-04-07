package org.word.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @ApiIgnore
    @RequestMapping(value = "/")
    public String index(HttpServletRequest request) {
        return "redirect:swagger-ui.html";
    }
}
