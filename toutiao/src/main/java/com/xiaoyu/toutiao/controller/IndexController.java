package com.xiaoyu.toutiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class IndexController {
    @RequestMapping(path={"/","/index"})
    @ResponseBody
    public String index(){
        return "11111";
    }


    @RequestMapping(value={"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId,
                            @PathVariable("userId")  int userId,
                            @RequestParam(value="type",defaultValue = "1" )int type,
                            @RequestParam(value="key",defaultValue = "nowcoder") String key){
        return String.format("GID{%s},UID{%d},TYPE{%d},KEY{%s}",groupId,userId,type,key);
    }

    @RequestMapping(value={"/vm"})
    public String news(){
        return "news";
    }


}

