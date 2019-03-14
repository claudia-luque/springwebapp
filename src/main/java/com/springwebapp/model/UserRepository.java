package com.springwebapp.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<SlackUser, Long>
{

}
