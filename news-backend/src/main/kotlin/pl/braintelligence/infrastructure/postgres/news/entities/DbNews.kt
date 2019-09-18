package pl.braintelligence.infrastructure.postgres.news.entities

import pl.braintelligence.core.news.News
import pl.braintelligence.infrastructure.postgres.Collections
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = Collections.TB_NEWS)
data class DbNews(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,

        var title: String = ""

) {
    companion object {
        fun toDbNews(news: News): DbNews = news.run {
            DbNews(title = title)
        }

        fun toListOfNews(dbNews: List<DbNews>): List<News> = dbNews.map {
            toNews(it)
        }

        private fun toNews(dbNews: DbNews): News = dbNews.run {
            News(title = title)
        }
    }
}

