package pl.braintelligence.infrastructure.postgres.news

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import pl.braintelligence.api.news.dto.NewTag
import pl.braintelligence.core.ports.outgoing.TagsRepository
import pl.braintelligence.infrastructure.postgres.news.entities.DbTags

interface PostgresTagsRepository : CrudRepository<DbTags, String>

@Component
class TagsRepositoryImpl : TagsRepository {
    override fun createNewTag(newTag: NewTag) {
        TODO("not implemented")
    }

    override fun getAllTags(): List<String> {
        TODO("not implemented")
    }

}
