package com.demo.riverstonehomesmanagement.models

import com.demo.riverstonehomesmanagement.utils.Res

data class Services(
    val id: String,
    val image: String,
    val title: String,
    val description: String,
)

fun getAllServices() = listOf<Services>(
    Services(
        id = "01",
        image = Res.CLEANING_SERVICE_IMAGE,
        title = "Cleaning Services",
        description = "Our professional cleaning services provide a thorough and efficient solution for all your cleaning needs. With our experienced team and top-of-the-line equipment, we guarantee a spotless and sanitized environment that exceeds your expectations."
    ),
    Services(
        id = "02",
        image = Res.LANDSCAPING_SERVICE_IMAGE,
        title = "Landscaping Services",
        description = "Achieve a beautifully manicured lawn with our professional lawn care services. From mowing and edging to fertilizing and weed control, our skilled team will ensure your lawn is lush, green, and healthy year-round. Sit back and relax while we take care of all your lawn maintenance needs, giving you the perfect outdoor oasis to enjoy."
    ),
    Services(
        id = "03",
        image = Res.QUALITY_LAWN_SERVICE_IMAGE,
        title = "Quality Lawn Services",
        description = "We pride ourselves on delivering superior quality in every project, ensuring your complete satisfaction and peace of mind."
    ),
    Services(
        id = "04",
        image = Res.PERSONALISED_SOLUTIONS_IMAGE,
        title = "Personalized Solutions",
        description = "Our dedicated team works closely with you to tailor solutions that reflect your style and preferences."
    ),
)