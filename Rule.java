package com.project.data.jpa.datajpatesting.rule.common;

import com.project.data.jpa.datajpatesting.rule.common.type.RuleType;
import com.project.data.jpa.datajpatesting.entites.TEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Rule<T, R> {
    String id();
    Optional<Map<String,T>> get();
    RuleType ruleType();
    void run(R ktpEntity, TEntity entities) throws Exception;
    Optional<List<String>> getConditionalIds();
    void setConditionalRules(List<Optional<Rule>> rules);
}
