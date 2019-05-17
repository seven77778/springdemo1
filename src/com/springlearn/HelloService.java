package com.springlearn;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by LSH on 2019/5/3 - 12:45.
 * <p>
 * declaration :
 */
public class HelloService {

    public String check(String name,String password){
        if(StringUtils.isNoneBlank(name,password)){
            return "welcome";
        }
        return "no pass!";
    }
}
