package com.neutrostar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neutrostar.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
