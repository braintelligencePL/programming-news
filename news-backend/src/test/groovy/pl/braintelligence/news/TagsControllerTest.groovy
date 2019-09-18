package pl.braintelligence.news

import org.springframework.core.ParameterizedTypeReference
import pl.braintelligence.api.Endpoints
import pl.braintelligence.api.news.dto.NewTag
import pl.braintelligence.base.BaseTest
import pl.braintelligence.core.news.News

class TagsControllerTest extends BaseTest {

    def "Should create NewTag and browse it"() {
        given:
        def newTag = new NewTag("tagName")

        and:
        post(Endpoints.API_TAGS, newTag)

        when:
        def response = get(Endpoints.API_TAGS, new ParameterizedTypeReference<List<News>>() {})

        then:
        with(response.body[0]) {
            title == "title"
        }
    }
}
