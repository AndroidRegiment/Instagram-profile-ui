package com.xtremedevx.insta.data.userProfile

data class BiographyWithEntities(
    val entities: List<Entity>,
    val raw_text: String
)