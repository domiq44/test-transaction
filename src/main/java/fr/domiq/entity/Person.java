package fr.domiq.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String firstName;
	private String LastName;

}
