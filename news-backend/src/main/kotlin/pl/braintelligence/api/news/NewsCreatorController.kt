package pl.braintelligence.api.news

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.api.Endpoints
import pl.braintelligence.api.news.dto.NewNews
import pl.braintelligence.core.ports.incoming.NewsService

@RestController
@RequestMapping(Endpoints.API_NEWS)
class NewsCreatorController(
        private val newsService: NewsService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createNews(@RequestBody newNews: NewNews) = newsService.createNews(newNews)

}
