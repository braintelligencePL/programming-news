package pl.braintelligence.core.news

import org.springframework.stereotype.Service
import pl.braintelligence.api.news.dto.NewNews
import pl.braintelligence.core.ports.incoming.NewsService
import pl.braintelligence.core.ports.outgoing.NewsRepository

@Service
class NewsServiceImpl(
        val newsRepository: NewsRepository
) : NewsService {

    override fun createNews(newNews: NewNews) = newsRepository
            .createNews(NewNews.toNews(newNews))

    override fun getNews(): List<News> = newsRepository
            .getNews()

}
