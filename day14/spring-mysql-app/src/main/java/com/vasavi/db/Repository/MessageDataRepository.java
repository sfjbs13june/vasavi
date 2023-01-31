package com.vasavi.db.repository;

import com.vasavi.db.model.Message;
import com.vasavi.db.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

