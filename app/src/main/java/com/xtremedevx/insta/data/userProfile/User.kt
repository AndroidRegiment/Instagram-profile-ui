package com.xtremedevx.insta.data.userProfile

data class User(
    val bio_links: List<Any>,
    val biography: String,
//    val biography_with_entities: BiographyWithEntities,
//    val blocked_by_viewer: Boolean,
//    val business_address_json: Any,
//    val business_category_name: Any,
//    val business_contact_method: String,
//    val business_email: Any,
//    val business_phone_number: Any,
//    val category_enum: Any,
//    val category_name: String,
//    val connected_fb_page: Any,
//    val country_block: Boolean,
    val edge_felix_video_timeline: EdgeFelixVideoTimeline,
    val edge_follow: EdgeFollow,
    val edge_followed_by: EdgeFollowedBy,
    val edge_media_collections: EdgeMediaCollections,
//    val edge_mutual_followed_by: EdgeMutualFollowedBy,
    val edge_owner_to_timeline_media: EdgeOwnerToTimelineMedia,
    val edge_related_profiles: EdgeRelatedProfiles,
    val edge_saved_media: EdgeSavedMedia,
    val external_url: String,
//    val external_url_linkshimmed: String,
//    val fbid: String,
    val followed_by_viewer: Boolean,
    val follows_viewer: Boolean,
    val full_name: String,
//    val group_metadata: Any,
//    val guardian_id: Any,
//    val has_ar_effects: Boolean,
//    val has_blocked_viewer: Boolean,
//    val has_channel: Boolean,
//    val has_clips: Boolean,
//    val has_guides: Boolean,
//    val has_requested_viewer: Boolean,
//    val hide_like_and_view_counts: Boolean,
//    val highlight_reel_count: Int,
    val id: String,
//    val is_business_account: Boolean,
//    val is_eligible_to_view_account_transparency: Boolean,
//    val is_embeds_disabled: Boolean,
//    val is_guardian_of_viewer: Boolean,
//    val is_joined_recently: Boolean,
    val is_private: Boolean,
//    val is_professional_account: Boolean,
//    val is_supervised_by_viewer: Boolean,
//    val is_supervised_user: Boolean,
//    val is_supervision_enabled: Boolean,
    val is_verified: Boolean,
//    val location_transparency_country: Any,
//    val overall_category_name: Any,
    val profile_pic_url: String,
    val profile_pic_url_hd: String,
//    val pronouns: List<Any>,
//    val requested_by_viewer: Boolean,
//    val restricted_by_viewer: Any,
//    val should_show_category: Boolean,
//    val should_show_public_contacts: Boolean,
//    val state_controlled_media_country: Any,
//    val transparency_label: Any,
//    val transparency_product: String,
    val username: String
)