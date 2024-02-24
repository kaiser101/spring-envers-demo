package com.example.demo.controller

import com.example.demo.entity.Person
import com.example.demo.repository.PersonRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/person")
class PersonController {

    PersonRepository personRepository

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository
    }

    @GetMapping("/{id}")
    Person getPersonById(@PathVariable("id") Integer id) {
        personRepository.findById(id)
    }

    @GetMapping("/")
    List<Person> getAllPersons() {
        personRepository.findAll()
    }

    @PostMapping("/add")
    Person savePerson(@RequestBody Person person) {
        personRepository.save(person)
    }

    @PutMapping("/{id}")
    Person updatePerson(@PathVariable("id") Integer id, @RequestBody Person person) {
        person.id = id
        personRepository.save(person)
    }

    @DeleteMapping("/{id}")
    def deletePerson(@PathVariable("id") Integer id) {
        personRepository.deleteById(id)
    }
}
