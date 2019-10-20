package com.example.Rent;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface LoginRepository extends MongoRepository<Profile, String> {

}
