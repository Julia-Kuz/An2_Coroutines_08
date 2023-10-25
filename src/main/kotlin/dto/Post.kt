package dto

data class Post(

    val author: String,
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
)
data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType,
)
enum class AttachmentType {
    IMAGE
}
