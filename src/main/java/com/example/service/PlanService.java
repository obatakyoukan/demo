package com.example.service;

import com.example.domain.Plan;
import com.example.repository.PlanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class PlanService {
 @Autowired
 PlanRepository planRepository;

 
 public List<Plan> findAll() {
  return planRepository.findAll();
 }

 public Plan findById(Integer id) {
  return planRepository.findById(id).get();
 }


 public Plan create(Plan plan) {
  return planRepository.save(plan);
 }
 public Plan update(Plan plan) {
  return planRepository.save(plan);
 }
 public void delete(Integer id) {
  planRepository.deleteById(id);
 }

}
