package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.RoleDTO;
import com.ngo.fundraiser.entity.Role;
import com.ngo.fundraiser.entity.User;
import com.ngo.fundraiser.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role saveRole(RoleDTO roleDTO) {
        Role role = new Role();
        role.setName(roleDTO.getName());
        role.setRights((roleDTO.getRights()));

        return roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

//    public Role addUserToRole(Long user_id, Role role) {
//        Role role = roleRepository.getById(user_id);
//        return roleRepository.addUserToRole(user_id, role);
//    }
}
