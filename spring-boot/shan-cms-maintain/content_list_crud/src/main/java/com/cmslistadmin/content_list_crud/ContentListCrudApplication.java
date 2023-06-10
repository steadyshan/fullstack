/* Application to add automation to updating the content of the 'content-management-system' CMS
 * 1 'content-management-system' is the angular web application written by me to upload, host and display my sketches
 * 2. It is currently (as of June 10 2023) a 'no-database' CMS application
 * 3. Raw data - images - is stored in a folder hierarchy under the assets folder of the angular app
 * 4. The image file names including relative path, details and other demographics are stored in different arrays of JSON objects
 * 5. These Arrays are stored in typescrip files, imported into the relevant component file and subsequently rendered
 * 
 * - Shantanu Gadkari
 */
package com.cmslistadmin.content_list_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContentListCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentListCrudApplication.class, args);
	}

}
