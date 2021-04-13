package com.mmz.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @Classname JsonUtils
 * @Description TODO
 * @Date 2021/3/3 22:27
 * @Created by mmz
 */
public class JsonUtils {

    public static String getJson(Object object,String sdf){
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS,false);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sdf);

        mapper.setDateFormat(simpleDateFormat);

        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
