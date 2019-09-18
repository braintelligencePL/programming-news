package pl.braintelligence.api.news.dto

import pl.braintelligence.core.news.News

data class NewNews(
        val title: String
//        val url: String,
//        val description: String,
//        val rootTag: String,
//        val subTag: String,
//        val tags: List<String>
) {
    companion object {
        fun toNews(newNews: NewNews): News = newNews.run {
            News(
                    title = title
            )
        }
    }
}
