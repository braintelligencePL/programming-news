package pl.braintelligence.api.news

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.api.Endpoints
import pl.braintelligence.api.news.dto.NewNews
import pl.braintelligence.core.news.NewsService

@RestController
@RequestMapping(Endpoints.API_TAGS)
class NewsTagsController(
        private val newsService: NewsService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createNewTag(@RequestBody newNews: NewNews) = newsService.createNews(newNews)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllAvailableTags(): List<String> = newsService.getAllTags()

}
