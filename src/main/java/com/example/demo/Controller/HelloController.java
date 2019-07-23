package com.example.demo.Controller;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@CrossOrigin
@RestController
public class HelloController {

   /* @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello1(@RequestParam String name, HttpServletResponse response) {
        System.out.println("ok");
        List<Object> list = new ArrayList<Object>();
        HashMap<String,Object> maps = new HashMap<String, Object>();

        maps.put("conpany", "河南电力");
        maps.put("section", "郑州分公司");
        maps.put("admin", "123123");
        maps.put("name", "张华凤");
        maps.put("tel", "954127004");
        maps.put("phone", "15056993012");

        list.add(maps);
        String jsonStr = JSON.toJSON(list).toString();
        response.setHeader("Access-Control-Allow-Origin", "*");
        return jsonStr;
    }*/

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public JSONArray hello2( HttpServletResponse response) {
        System.out.println("ok");
        List<Object> list1 = new ArrayList<Object>();
        HashMap<String,Object> maps1 = new HashMap<String, Object>();

        maps1.put("conpany", "河南电力");
        maps1.put("section", "郑州分公司");
        maps1.put("admin", "123123");
        maps1.put("name", "张华凤");
        maps1.put("tel", "954127004");
        maps1.put("phone", "15056993012");

        list1.add(maps1);
        JSONArray array = JSONArray.fromObject(list1);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return array;
    }

    @RequestMapping(value = "/delUser",method = RequestMethod.POST)
    public String delUser(@RequestParam String name, HttpServletResponse response){

        System.out.println("前端携带的id和name:" + name);
        System.out.println("ok");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "ok";
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam String name,HttpServletResponse response){

        System.out.println("前端添加用户" + name);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "ok";
    }

    @RequestMapping(value = "/catUser",method = RequestMethod.POST)
    public String catUser(@RequestParam String name,HttpServletResponse response){
        System.out.println("前端查看用户" + name);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "catUser";
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    public String editUser(@RequestParam String name,HttpServletResponse response){

        System.out.println("前端编辑用户" + name);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "editUser";
    }
}
