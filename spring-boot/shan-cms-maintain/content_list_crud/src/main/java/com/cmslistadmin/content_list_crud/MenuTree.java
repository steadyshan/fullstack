package com.cmslistadmin.content_list_crud;
// package com.cmslistadmin.content_list_services;

public class MenuTree {
    MenuTreeFields menuTreeFields = new MenuTreeFields();
    public MenuTree() {

    }
    public MenuTreeFields getRecord() {
        return this.menuTreeFields;
    }
    public String getLabel() {
        return  menuTreeFields.label ;
    }
    /*
     * 
export interface MenuItem {
    uniqueKey: string;
    parentKey: string;
    parent?: boolean;// also use for expand
    child: boolean
    key: string;
    label: string;
    roles: string[]; // unused for now ;
    children?: MenuItem[];
    dateUploaded?: string;
    tab:string;
};
     */
}
