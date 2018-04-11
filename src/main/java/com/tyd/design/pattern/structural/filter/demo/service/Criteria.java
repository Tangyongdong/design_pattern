package com.tyd.design.pattern.structural.filter.demo.service;

import java.util.List;

/**
 * Created by tangyongdong on 2018/4/11
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
