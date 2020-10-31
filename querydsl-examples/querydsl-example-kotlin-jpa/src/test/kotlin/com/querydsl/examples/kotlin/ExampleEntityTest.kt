package com.querydsl.examples.kotlin

import com.querydsl.examples.kotlin.entity.ExampleEntity
import com.querydsl.examples.kotlin.entity.QExampleEntity
import com.querydsl.examples.kotlin.entity.QExampleEntity.exampleEntity
import com.querydsl.jpa.impl.JPAQuery
import org.junit.Test

class ExampleEntityTest {

    @Test
    fun basicMetamodelExpression() {
        val child : QExampleEntity = QExampleEntity("child")

        JPAQuery<ExampleEntity>()
                .from(exampleEntity)
                .innerJoin(exampleEntity.children, child)
                .select(exampleEntity.name, child.name)
    }

}