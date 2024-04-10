package de.neuefische.cgnjava241openai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * {
 *      "model": "gpt-3.5-turbo",
 *      "messages": [
 *          {
 *              "role": "user",
 *              "content": "Was ist eine Primzahl"
 *          }
 *      ]
 * }
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenAiRequest {

    private String model;
    private List<OpenAiMessage> messages;

    public OpenAiRequest(String question){
        this.model = "gpt-3.5-turbo";
        this.messages = List.of(new OpenAiMessage(question));
    }

}
