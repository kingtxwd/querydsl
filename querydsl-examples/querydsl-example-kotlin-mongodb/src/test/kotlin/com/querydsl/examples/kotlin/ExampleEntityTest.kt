package com.querydsl.examples.kotlin

import com.querydsl.examples.kotlin.entity.QExampleEntity
import org.junit.Test

class ExampleEntityTest {

    @Test
    fun basicMetamodelExpression() {
        val example : QExampleEntity = QExampleEntity("example")
        val predicate = example.name.eq("Eric")
    }

}