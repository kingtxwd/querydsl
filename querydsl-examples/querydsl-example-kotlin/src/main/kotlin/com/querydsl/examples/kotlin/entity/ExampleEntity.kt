package com.querydsl.examples.kotlin.entity

import javax.persistence.*

@Entity
data class ExampleEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int,

        @Column
        val name: String,

        @OneToMany(mappedBy = "parent")
        val children: List<ExampleEntity>? = null,

        @ManyToOne
        val parent: ExampleEntity? = null
) {
}