package com.devsuperior.dscatalog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInsertDTO extends UserDTO{
	private static final long serialVersionUID = 1L;

	@Size(min = 5, max = 255, message = "Deve ter entre 5 e 255 caracteres")
	@NotBlank(message = "Campo requerido")
	private String password;

	public UserInsertDTO() {
		super();
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
