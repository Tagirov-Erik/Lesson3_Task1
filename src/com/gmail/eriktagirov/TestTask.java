package com.gmail.eriktagirov;

import java.lang.annotation.*;

@Inherited
//@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface TestTask {
    int a() default 1;
    int b() default 1;
}
