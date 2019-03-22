package com.cf.demo.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<Name,String> {
    String name;

    @Override
    public void initialize(Name constraintAnnotation) {
        this.name = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value != null){
            if(value.startsWith(this.name)){
                return false;
            }
            return true;
        }
        return false;
    }
}
