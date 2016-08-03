package seed.seyfer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by seyfer on 8/3/16.
 */
@Controller
public class IndexController
{
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
