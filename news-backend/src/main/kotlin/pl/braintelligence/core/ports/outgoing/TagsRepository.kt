package pl.braintelligence.core.ports.outgoing

import pl.braintelligence.api.news.dto.NewTag

interface TagsRepository {
    fun createNewTag(newTag: NewTag)
    fun getAllTags(): List<String>
}
