package pl.braintelligence.core.news

interface NewsCreatorRepository {
    fun createNews(news: News)
    fun getNews(): List<News>
}
