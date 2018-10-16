package com.xiaoyu.toutiao.controller;
import com.xiaoyu.toutiao.aspect.LogAspect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.xiaoyu.toutiao.aspect.LogAspect;
//import com.xiaoyu.toutiao.model.User;
//import com.xiaoyu.toutiao.service.ToutiaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller

public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(path={"/","/index"})
    @ResponseBody
    public String index(){
        logger.info("Visit Index");
        logger.info("Visit Index");
        return "11111";
    }


    @RequestMapping(value={"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId,
                            @PathVariable("userId")  int userId,
                            @RequestParam(value="type",defaultValue = "1" )int type,
                            @RequestParam(value="key",defaultValue = "nowcoder") String key){
        logger.info("马克");
        return String.format("GID{%s},UID{%d},TYPE{%d},KEY{%s}",groupId,userId,type,key);
    }

    @RequestMapping(value={"/vm"})
    public String news(){
        return "news";
    }



}

