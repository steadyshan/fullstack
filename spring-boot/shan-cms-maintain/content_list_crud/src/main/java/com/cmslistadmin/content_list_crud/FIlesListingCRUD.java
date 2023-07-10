package com.cmslistadmin.content_list_crud;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cmslistadmin.content_list_crud.business.FilesListing;
import com.cmslistadmin.content_list_crud.business.FilesListingJSON;
import com.cmslistadmin.content_list_crud.business.ImageListJSON;
import com.cmslistadmin.content_list_crud.business.ImageList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType ;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
    public class FIlesListingCRUD {
        @GetMapping("/listing/{term}")
        public String getFolderContent( @PathVariable("term") String term) {
        System.out.println(term);

        return "search";
    }

    @PostMapping( path = "/listing" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String[]  getFolderContents(@RequestBody String parent) {
        FilesListing subContents = new FilesListing();
        return subContents.getFileListing(parent) ;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/listing2")
    public String getFolderContent( ) {
        return "TESR";
    }
     @PostMapping( path = "/move" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String  moveToFolder(@RequestBody FilesListingJSON moveDetails) {
        FilesListing moveImage = new FilesListing();
        moveImage.moveFile(moveDetails.sourceFolder, 
                            moveDetails.destinationFolder, 
                            moveDetails.sourceFileName, 
                            moveDetails.destFileName) ;   
        return  "yes"; //updateImageJSON.processImage(entity);
    }

     @PostMapping( path = "/append" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String  Append(@RequestBody String[] fileAndLines) {
        FilesListing writeFile = new FilesListing();
        writeFile.writeLines(fileAndLines ) ;   
        return  "yes"; //updateImageJSON.processImage(entity);
    }
}
