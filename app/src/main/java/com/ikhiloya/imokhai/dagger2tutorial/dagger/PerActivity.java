package com.ikhiloya.imokhai.dagger2tutorial.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Scope;
import javax.inject.Singleton;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation for activity-wide scope
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
