package com.project.data.jpa.datajpatesting.rule.common;

import java.util.*;

public abstract class AbstractRule<T, R> implements Rule<T, R> {

    private Optional<Map<String,T>> result = Optional.empty();
    private List<String> conditionalIds = Collections.emptyList();
    private List<Optional<Rule>> conditionalRules = null;

    @Override
    public Optional<Map<String,T>> get() {
        return result;
    }

    @Override
    public Optional<List<String>> getConditionalIds() {
        return Optional.of(conditionalIds);
    }

    @Override
    public void setConditionalRules(List<Optional<Rule>> rules){
        conditionalRules = rules;
    }
}
