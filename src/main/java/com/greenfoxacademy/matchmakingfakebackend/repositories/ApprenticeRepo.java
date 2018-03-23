package com.greenfoxacademy.matchmakingfakebackend.repositories;

import com.greenfoxacademy.matchmakingfakebackend.models.Apprentice;
import com.sun.istack.internal.Nullable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenticeRepo extends CrudRepository<Apprentice, Integer>,
        JpaSpecificationExecutor {

//  List<Apprentice> findAllByCohort(String cohort);
//  @Query(value = "SELECT a FROM apprentice a WHERE (?1 is null or a.cohortClass = ?1) and (?2 is null or a.email = ?2)")
//  List<Apprentice> findAllByCohortClassAndEmail(String cohortClass, String email);
//  Apprentice findAllByFirstNameAndLastName(String firstName, String lastName);
//  Apprentice findByEmailIsContaining(String email);
//  Apprentice findBySlackChannelIdContaining(String slackChannelId);


//  public List<Client> search(String fileNo, String firstname, String lastname) {
//    String query = "select c from Client c where (?1 is null or c.fileNo = ?1) and (?2 is null or c.firstname = ?2) and (?3 is null or c.lastname = ?3)";
//    return getJpaTemplate().find(query, fileNo, firstname, lastname);
//  }
}
