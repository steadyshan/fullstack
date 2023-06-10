package com.cmslistadmin.content_list_crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageListCRUD {

    @RequestMapping(method = RequestMethod.GET, path = "/filename")
    public String getListName() {
        return "ganesh-list.ts";
    }
    
}
