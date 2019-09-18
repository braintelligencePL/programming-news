package pl.braintelligence.api.news

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.api.Endpoints
import pl.braintelligence.api.news.dto.NewTag
import pl.braintelligence.core.ports.incoming.TagsService

@RestController
@RequestMapping(Endpoints.API_TAGS)
class TagsController(
        private val tagsService: TagsService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createNewTag(@RequestBody newTag: NewTag) = tagsService.createTag(newTag)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllTags(): List<String> = tagsService.getAllTags()

}

