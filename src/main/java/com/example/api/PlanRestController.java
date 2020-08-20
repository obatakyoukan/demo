package com.example.api;

import com.example.domain.Plan;
import com.example.service.PlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/")
public class PlanRestController {
 @Autowired
 PlanService planService;

 @GetMapping
 List<Plan> getPlans() {
  return planService.findAll();
 }

 @GetMapping(path = "{id}" )
 Plan getPlan(@PathVariable Integer id) {
  Plan plan = planService.findById(id);
  return plan;
 }

 
 @PostMapping
 ResponseEntity<Plan> postPlans(@RequestBody Plan plan, UriComponentsBuilder uriBuilder ) {
  Plan created = planService.create(plan);
  URI location = uriBuilder.path("{id}")
   	.buildAndExpand(created.getId() ).toUri();
	return ResponseEntity.created(location).body(created);
 }

 @PutMapping(path = "{id}" )
 Plan putPlan(@PathVariable Integer id, @RequestBody Plan plan) {
  plan.setId(id);
  return planService.create(plan);
 }

 @DeleteMapping(path = "{id}" )
 @ResponseStatus(HttpStatus.NO_CONTENT)
 void deletePlan(@PathVariable Integer id) {
  planService.delete(id);
 }

}
