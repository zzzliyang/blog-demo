package io.zzzliyang.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Liyang, Zhang on 3/18/2017.
 */
@Controller
public class MyController {

    @RequestMapping("/another-page")
    public String anotherPage() {
        return "another-page";
    }
}
