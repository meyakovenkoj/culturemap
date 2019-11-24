package ru.imitation.culturemap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.imitation.culturemap.repository.LocationDao;
import ru.imitation.culturemap.repository.LocationDaoImpl;
import ru.imitation.culturemap.repository.LocationDaomy;
import ru.imitation.culturemap.service.DataYandexAPI;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class MapController {
    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
//        List<Map<String, Object>> adresses = LocationDaomy.getLocations();
//        DataYandexAPI.parseDB(adresses);
//        File data = new File("/data/data.json");
//        if (data.exists()) {
//            try {
//                data.delete();
//                data.createNewFile();
//            } catch (IOException ignored) {
//            }
//        }
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
