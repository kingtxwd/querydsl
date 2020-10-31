package com.querydsl.examples.kotlin.entity

import com.querydsl.core.annotations.QueryEntity
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
@QueryEntity
data class ExampleEntity(
        @Id
        val id: Int,

        val name: String,

        val age : Int
) {
}