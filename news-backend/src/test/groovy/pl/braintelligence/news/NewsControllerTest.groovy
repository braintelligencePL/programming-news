package pl.braintelligence.news

import org.springframework.core.ParameterizedTypeReference
import pl.braintelligence.api.Endpoints
import pl.braintelligence.api.news.dto.NewNews
import pl.braintelligence.base.BaseTest
import pl.braintelligence.core.news.News

class NewsControllerTest extends BaseTest {

    def "Should create NewNews and browse it"() {
        given: "prepare new NEWS"
        def newNews = new NewNews("title")

        and: "create new NEWS"
        post(Endpoints.API_NEWS, newNews)

        when: "Browse news"
        def response = get(Endpoints.API_NEWS, new ParameterizedTypeReference<List<News>>() {})

        then:
        with(response.body[0]) {
            title == "title"
        }
    }
}
