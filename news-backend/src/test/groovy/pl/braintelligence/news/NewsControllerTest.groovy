package pl.braintelligence.news

import org.springframework.core.ParameterizedTypeReference
import pl.braintelligence.api.news.dto.NewNews
import pl.braintelligence.base.BaseTest
import pl.braintelligence.core.news.News

class NewsControllerTest extends BaseTest {

    def "Should create NewNews and return it"() {
        given:
        def newNews = new NewNews("title")

        and:
        post("/api/news", newNews)

        when:
        def response = get("/api/news", new ParameterizedTypeReference<List<News>>() {})

        then:
        with(response.body[0]) {
            title == "title"
        }
    }
}
