package com.ngo.fundraiser.repository;

import com.ngo.fundraiser.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
//    Role addUserToRole(Long user_id, Role role);
}
