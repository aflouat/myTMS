package fr.aflouat.MyTMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aflouat.MyTMS.dto.CustomFieldDTO;
import fr.aflouat.MyTMS.model.CustomField;
import fr.aflouat.MyTMS.service.CustomFieldService;

@RestController
@RequestMapping("/api/custom-fields")
public class CustomFieldController {
	 @Autowired
	    private CustomFieldService customFieldService;

	    @PostMapping
	    public void createCustomField(@RequestBody CustomFieldDTO customFieldDTO) {
	         customFieldService.save(customFieldDTO);
	    }
}
