package fr.aflouat.MyTMS.dto;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data @Getter @Setter @AllArgsConstructor
public class CustomFieldDTO {
	private Long id;
	   private String name;
	    private String type;
	    private List<String> expectedValues;
}
