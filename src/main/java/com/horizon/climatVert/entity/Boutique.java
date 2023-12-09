package com.horizon.climatVert.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Boutique {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_boutique;
	private String item;
	private float price;
	private int picture;
	private String description;
	

}
