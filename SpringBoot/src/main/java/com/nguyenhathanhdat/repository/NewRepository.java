package com.nguyenhathanhdat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenhathanhdat.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
