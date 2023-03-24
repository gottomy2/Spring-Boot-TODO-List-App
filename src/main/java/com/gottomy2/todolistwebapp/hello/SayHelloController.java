package com.gottomy2.todolistwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("""
                <html>
                    <head>
                        <title>Simple HTML Page</title>
                    </head>
                    <body>
                        Hardcoded HTML page
                    </body>
                </html>
                """);

        return sb.toString();
    }
}
