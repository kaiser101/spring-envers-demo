package com.example.demo.repository

import com.example.demo.entity.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository extends CrudRepository<Person, Integer> {
}
