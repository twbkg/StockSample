package xyz.twbkg.stock.di.scpe

import javax.inject.Scope

/**
 * The ServiceScoped custom scoping annotation specifies that the lifespan of a dependency be
 * the same as that of a Service. This is used to annotate dependencies that behave like a
 * singleton within the lifespan of a Service.
 */
@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(AnnotationTarget.TYPE, AnnotationTarget.FUNCTION)
annotation class ServiceScoped