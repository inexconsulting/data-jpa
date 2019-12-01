package com.project.data.jpa.datajpatesting.rule.common.type;

import javax.persistence.Column;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FunctionalRule {
    @Column
    DeclarativeType declarativeType() default DeclarativeType.TRANSACTION;
    TransactionType transactionType() default TransactionType.ALL;
}
