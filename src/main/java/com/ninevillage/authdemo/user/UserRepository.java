package com.ninevillage.authdemo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
    @RestResource(path = "by-email")
    User findByEmail(String email);
}
