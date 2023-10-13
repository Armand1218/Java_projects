package com.armando.DojoAndNinja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.DojoAndNinja.model.Dojo;
import com.armando.DojoAndNinja.model.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
}
 