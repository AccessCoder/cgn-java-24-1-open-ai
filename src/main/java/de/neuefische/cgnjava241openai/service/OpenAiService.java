package de.neuefische.cgnjava241openai.service;

import de.neuefische.cgnjava241openai.model.OpenAiRequest;
import de.neuefische.cgnjava241openai.model.OpenAiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class OpenAiService {

    private final RestClient client;

    public OpenAiService(
           @Value("${API_KEY}") String apiKey,
           @Value("${BASE_URL}") String baseUrl
    ) {
       client = RestClient.builder()
               .baseUrl(baseUrl)
               .defaultHeader("Authorization", "Bearer "+apiKey)
               .build();
    }

    public String askQuestion(String q) {
        OpenAiRequest request = new OpenAiRequest(q);
        return client.post()
                .body(request)
                .retrieve()
                .body(OpenAiResponse.class)
                .getAnswer();
    }
}
