package com.tttt.restapi.user.repository;

import com.tttt.restapi.user.model.User;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String>{
    public Optional<User> findById(String id);
    @Query(value = "{ $or: [{'userName': {$regex: ?#{#keyword != null ? #keyword : '' }, $options: 'i'}},"
            +"{'firstName': {$regex: ?#{#keyword != null ? #keyword : '' }, $options: 'i'}}" 
            +"{'lastName': {$regex: ?#{#keyword != null ? #keyword : '' }, $options: 'i'}}" 
            +"{'phoneNumber': {$regex: ?#{#keyword != null ? #keyword : '' }, $options: 'i'}}" 
            + "] }")
    public Page<User> findAllByKey(String keyword, Pageable pageable);
}
