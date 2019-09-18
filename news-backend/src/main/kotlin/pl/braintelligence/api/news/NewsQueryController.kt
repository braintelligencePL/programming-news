package pl.braintelligence.api.news

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.api.Endpoints
import pl.braintelligence.core.news.News
import pl.braintelligence.core.news.NewsService

@RestController
@RequestMapping(Endpoints.API_NEWS)
class NewsQueryController(
        private val newsService: NewsService
) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getNews(): List<News> = newsService.getNews()

}
