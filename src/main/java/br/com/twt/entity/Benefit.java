package br.com.twt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Benefit")
@EqualsAndHashCode(callSuper = false)
public class Benefit extends CommonEntity {

	private String name;
	private String description;
	private boolean active;

}
