package com.example.reverseswagger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

    @Override
    List<UserEntity> findAllById(Iterable<Long> longs);

//    Page<UserEntity> findAll(Pageable pageable);
}
