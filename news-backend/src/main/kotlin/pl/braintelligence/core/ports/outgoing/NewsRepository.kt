package pl.braintelligence.core.ports.outgoing

import pl.braintelligence.core.news.News

interface NewsRepository {
    fun createNews(news: News)
    fun getNews(): List<News>
}
