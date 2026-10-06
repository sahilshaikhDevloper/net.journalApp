package net.shaikh.journelApp.repository;

import net.shaikh.journelApp.Entity.JournelEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryInterface extends MongoRepository<JournelEntity, String> {

}
