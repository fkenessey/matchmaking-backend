package com.greenfoxacademy.matchmakingfakebackend.services;

import com.greenfoxacademy.matchmakingfakebackend.models.Apprentice;
import com.greenfoxacademy.matchmakingfakebackend.repositories.ApprenticeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApprenticeService {

  @Autowired
  ApprenticeRepo apprenticeRepo;

  public List superdooperlist(Apprentice filter) {

    List apprentices = apprenticeRepo.findAll((root, query, cb) -> {

      List<Predicate> predicates = new ArrayList<>();

      if (filter.getCohort() != null) {
        predicates.add(cb.equal(root.get("cohort"), filter.getCohort()));
      }

      if (filter.getFirstName() != null) {
        predicates.add(cb.equal(root.get("firstName"), filter.getCohort()));
      }
      return cb.and(predicates.toArray(new Predicate[0]));
    });

    return apprentices;
  }

//  public List<Apprentice> getAll() {
//    return (List<Apprentice>) apprenticeRepo.findAll();
//  }
//
//  public Apprentice getOneById(Integer id) {
//    return apprenticeRepo.findOne(id);
//  }
//
//  public Apprentice getOneByEmail(String email) {
//    return apprenticeRepo.findByEmailIsContaining(email);
//  }
//
//  public Apprentice getOneBySlackId(String slackChannelId) {
//    return apprenticeRepo.findBySlackChannelIdContaining(slackChannelId);
//  }
//
//  public List<Apprentice> getAllByCohort(String cohort) {
//    return apprenticeRepo.findAllByCohort(cohort);
//  }
//
//  public List<Apprentice> getAllByClassCohort(String cohortClass, String email) {
//    List<Apprentice> apprenticeList = apprenticeRepo.findAllByCohortClassAndEmail(cohortClass, email);
////    return apprenticeRepo.findAllByCohortClassAndEmail(cohortClass, email);
//    return apprenticeList;
//  }
//
//  public Apprentice getAllByName(String firstName, String lastName) {
//    return apprenticeRepo.findAllByFirstNameAndLastName(firstName, lastName);
//  }
}
