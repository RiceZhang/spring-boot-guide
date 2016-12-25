package org.github.guide.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by R on 2016/12/5.
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}
