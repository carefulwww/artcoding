package com.artcode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artcode.mapper.PersonMapper;
import com.artcode.model.Person;
import com.artcode.service.IPersonService;

@Service
public class PersonServiceImpl implements IPersonService {

  @Autowired
  private PersonMapper personMapper;

  public List<Person> loadPersons() {
    // return this.personMapper.queryAll();
    return this.personMapper.selectAll();
  }

}
