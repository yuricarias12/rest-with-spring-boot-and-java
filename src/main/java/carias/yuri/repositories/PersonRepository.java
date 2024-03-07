package carias.yuri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import carias.yuri.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
