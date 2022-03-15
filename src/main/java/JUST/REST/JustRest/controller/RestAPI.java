package JUST.REST.JustRest.controller;

import JUST.REST.JustRest.entity.Language;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPI {

    @RequestMapping(method = RequestMethod.GET, path = "/langs")
    public String GetAll()
    {
        return "get ALl";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public String Add(@RequestBody Language language)                 //JSON 형식으로 받기 위해서는 @RequestBody를 입력해준다.
    {
        return "Add";
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}")                // 동적인 URL 요청은
    public String Update (@RequestBody Language language, @PathVariable int id)           //  PathVariable을 통해 받는다.
    {
        return "Update";
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
    public String Delete(@PathVariable int id)
    {
        return "Delete";
    }

}


