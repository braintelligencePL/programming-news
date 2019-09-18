package pl.braintelligence.core.news

import org.springframework.stereotype.Service
import pl.braintelligence.api.news.dto.NewNews

@Service
class NewsService(
        val newsRepository: NewsCreatorRepository
) {

    fun createNews(newNews: NewNews) = newsRepository
            .createNews(NewNews.toNews(newNews))

    fun getNews(): List<News> = newsRepository
            .getNews()

    fun getAllTags(): List<String> =
            TODO("not implemented")

}
