package pl.braintelligence.core.ports.incoming

import pl.braintelligence.api.news.dto.NewNews
import pl.braintelligence.core.news.News

interface NewsService {
    fun createNews(newNews: NewNews)
    fun getNews(): List<News>
}
