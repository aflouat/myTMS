package fr.aflouat.MyTMS.model;
import jakarta.persistence.*;
import lombok.*;
 

import java.util.List;
@Entity @Data @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class CustomField {
	// CustomField.java


	
 

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String type;
	    private List<String> expectedValues;

	    // getters and setters
	
}
