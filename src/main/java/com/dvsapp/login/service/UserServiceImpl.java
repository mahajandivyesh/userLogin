package com.dvsapp.login.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.dvsapp.login.dto.UserDTO;
import com.dvsapp.login.entity.UserEntity;
import com.dvsapp.login.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository iUserRepository;

	@Override
	public UserDTO loginUser(UserDTO user) {
		UserEntity entity = iUserRepository.findByEmailAndPassword(user.getEmail() , user.getPassword());
		System.out.println("ENTITY IS :::>>> "+entity);
		if(entity !=null) {
			UserDTO dto =  new UserDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}
}
