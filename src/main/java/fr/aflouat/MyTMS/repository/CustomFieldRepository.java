package fr.aflouat.MyTMS.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.aflouat.MyTMS.model.CustomField;

public interface CustomFieldRepository extends JpaRepository<CustomField, Long> {
}