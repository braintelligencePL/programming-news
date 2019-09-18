package pl.braintelligence.core.ports.incoming

import pl.braintelligence.api.news.dto.NewTag


interface TagsService {
    fun createTag(newTag: NewTag)
    fun getAllTags(): List<String>
}
