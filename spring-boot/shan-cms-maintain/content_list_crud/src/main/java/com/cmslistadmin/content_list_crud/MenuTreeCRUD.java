package com.cmslistadmin.content_list_crud;
// import com.cmslistadmin.content_list_services.MenuTree; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuTreeCRUD {

    @RequestMapping(method = RequestMethod.GET, path =  "/menu-stats")
    public String getMenuTreeStats() {
        // MenuTree a = new MenuTree() ;
        return "Menu Tree.ts recs";
    }
    @RequestMapping(method = RequestMethod.GET, path =  "/menu-label")
    public String getMenuLabel() {
         MenuTree a = new MenuTree();
         
        return a.getLabel() ;
    }
    @RequestMapping(method = RequestMethod.GET, path =  "/menu-json")
    public MenuTreeFields getMenuJSON() {
         MenuTree a = new MenuTree();
         
        return a.getRecord()  ;
    }
}
