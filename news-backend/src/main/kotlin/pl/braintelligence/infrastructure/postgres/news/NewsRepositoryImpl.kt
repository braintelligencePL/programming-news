package pl.braintelligence.infrastructure.postgres.news

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import pl.braintelligence.core.news.News
import pl.braintelligence.core.ports.outgoing.NewsRepository
import pl.braintelligence.infrastructure.postgres.news.entities.DbNews
import pl.braintelligence.logger

@Repository
interface PostgresNewsRepository : CrudRepository<DbNews, Long>

@Component
class NewsRepositoryImpl(
        private val postgresNewsRepository: PostgresNewsRepository
) : NewsRepository {

    private val log by logger()

    override fun createNews(news: News) = run {
        DbNews.toDbNews(news)
    }.let {
        postgresNewsRepository.save(it)
    }.let {
        log.info("Saved DbNews={$it}")
    }

    override fun getNews(): List<News> = run {
        postgresNewsRepository.findAll().toList()
    }.let {
        DbNews.toListOfNews(it)
    }
}
