package com.project.data.jpa.datajpatesting.rule;


import com.project.data.jpa.datajpatesting.entites.KtpEntity;
import com.project.data.jpa.datajpatesting.entites.TEntity;
import com.project.data.jpa.datajpatesting.rule.common.AbstractRule;
import com.project.data.jpa.datajpatesting.rule.common.type.DeclarativeType;
import com.project.data.jpa.datajpatesting.rule.common.type.FunctionalRule;
import com.project.data.jpa.datajpatesting.rule.common.type.RuleType;
import com.project.data.jpa.datajpatesting.rule.common.type.TransactionType;

@FunctionalRule(declarativeType = DeclarativeType.TRANSACTION, transactionType = TransactionType.ALL)
public class PersonRule extends AbstractRule<String, KtpEntity> {

    @Override
    public String id() {
        return "PERSON_RULE";
    }

    @Override
    public RuleType ruleType() {
        return RuleType.SIMPLE_FIELD;
    }

    @Override
    public void run(KtpEntity ktpEntity, TEntity entities) throws Exception {
        // FUNCTIONAL RULE...
    }
}
