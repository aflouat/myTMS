package fr.aflouat.MyTMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aflouat.MyTMS.dto.CustomFieldDTO;
import fr.aflouat.MyTMS.mapper.CustomFieldMapper;
import fr.aflouat.MyTMS.model.CustomField;
import fr.aflouat.MyTMS.repository.CustomFieldRepository;
@Service
public class CustomFieldService {
	@Autowired
	private CustomFieldRepository customFieldRepository;
	@Autowired
	private CustomFieldMapper customFieldMapper;


	public void save(CustomFieldDTO customFieldDTO) {
		// TODO Auto-generated method stub
        CustomField customField = customFieldMapper.dtoToEntity(customFieldDTO);

		 customFieldRepository.save(customField);
	}

}
