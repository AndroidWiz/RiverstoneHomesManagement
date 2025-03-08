package com.demo.riverstonehomesmanagement.models

data class Beliefs(
    val title: String,
    val description: String,
)

fun getAllBeliefs() = listOf<Beliefs>(
    Beliefs(
        title = "Quality",
        description = "We prioritize quality in every aspect of our work, from materials selection to craftsmanship, ensuring lasting results that exceed expectations."
        ),
    Beliefs(
        title = "Client-Centric",
        description = "Putting our clients first, we tailor our services to meet their needs, fostering collaborative relationships built on trust and transparency."
    ),
    Beliefs(
        title = "Innovation",
        description = "Embracing innovation and creativity, we constantly seek new methods and technologies to enhance our projects and deliver cutting-edge solutions."
    )
)