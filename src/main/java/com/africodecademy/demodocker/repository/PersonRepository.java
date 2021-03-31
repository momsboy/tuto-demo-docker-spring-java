package com.africodecademy.demodocker.repository;

import com.africodecademy.demodocker.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by momsboy on 3/26/21.
 */
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

}
