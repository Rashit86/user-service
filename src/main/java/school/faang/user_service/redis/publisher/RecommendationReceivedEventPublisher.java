package school.faang.user_service.redis.publisher;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Component;
import school.faang.user_service.model.event.RecommendationReceivedEvent;

@Component
public class RecommendationReceivedEventPublisher extends AbstractEventPublisher<RecommendationReceivedEvent> {
    public RecommendationReceivedEventPublisher(@Qualifier("eventRedisTemplate") RedisTemplate<String, Object> redisTemplate,
                                                ObjectMapper objectMapper,
                                                @Qualifier("recommendationReceivedChannelTopic") ChannelTopic topic) {
        super(redisTemplate, objectMapper, topic);
    }
}