package pl.braintelligence.core.news

import org.springframework.stereotype.Service
import pl.braintelligence.api.news.dto.NewTag
import pl.braintelligence.core.ports.incoming.TagsService
import pl.braintelligence.core.ports.outgoing.TagsRepository

@Service
class TagsServiceImpl(
        private val tagsRepository: TagsRepository
) : TagsService {
    override fun createTag(newTag: NewTag) = tagsRepository.createNewTag(newTag)

    override fun getAllTags(): List<String> = tagsRepository.getAllTags()
}
