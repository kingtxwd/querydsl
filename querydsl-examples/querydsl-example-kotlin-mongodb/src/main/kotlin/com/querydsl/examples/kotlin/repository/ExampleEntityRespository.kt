package com.querydsl.examples.kotlin.repository

import com.querydsl.examples.kotlin.entity.ExampleEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor

interface ExampleEntityRespository : MongoRepository<ExampleEntity, String>, QuerydslPredicateExecutor<ExampleEntity> {
}