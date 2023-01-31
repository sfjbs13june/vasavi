package com.vasavi.db.repository;

import com.vasavi.db.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {
}

