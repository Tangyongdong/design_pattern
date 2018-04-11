package com.tyd.design.pattern.structural.filter.demo.service.impl;

import com.tyd.design.pattern.structural.filter.demo.service.Person;
import com.tyd.design.pattern.structural.filter.demo.service.Criteria;

import java.util.List;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
