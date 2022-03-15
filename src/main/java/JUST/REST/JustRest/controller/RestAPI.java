package JUST.REST.JustRest.controller;

import JUST.REST.JustRest.entity.Language;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestAPI {

    private List<Language> languageList  = new ArrayList<>();               ///DB 가 아닌 List 형식으로 사용할 예정


    @RequestMapping(method = RequestMethod.GET, path = "/langs")
    public List<Language> GetAll()
    {
        return languageList;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public String Add(@RequestBody Language language)                 //JSON 형식으로 받기 위해서는 @RequestBody를 입력해준다.
    {
        languageList.add(language);
        return "Add";
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}")                // 동적인 URL 요청은
    public String Update (@RequestBody Language tolanguage, @PathVariable int id)           //  PathVariable을 통해 받는다.
    {
        Language find_language = languageList.stream().filter(language ->language.getId() ==id ).findAny().orElse(null);

        if (find_language!= null)
        {
            find_language.setId(tolanguage.getId());
            find_language.setName(tolanguage.getName());
            find_language.setLevel(tolanguage.getLevel());
            return "success";
        }

        return "not success";
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
    public String Delete(@PathVariable int id)
    {
        Language find_language = languageList.stream().filter(language -> language.getId() == id).findAny().orElse(null);
        //책이 있다면 책을 return 없다면 null return

        if (find_language != null)
        {
            languageList.remove(find_language);
            return "success";
        }
        else {
            return "not success";
        }
    }

}


