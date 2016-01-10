package GeolocationMessaging.repositories;

import GeolocationMessaging.messages.Message;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;

public interface MessageRepository extends ElasticsearchCrudRepository<Message, Integer> {

    List<Message> findByMessageId(Integer messageId);

    List<Message> findByUserId(Integer userId);

    List<Message> findByMessageContentsLike(String messageContents);

}