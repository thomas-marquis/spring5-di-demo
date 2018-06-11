package guru.springframework.config;

import guru.springframework.bean.FakeDataSource;
import guru.springframework.bean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUser;

    @Value("${guru.jms.username}")
    String jmsPassword;

    @Value("${guru.jms.username}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource()
                .setName(user)
                .setPassword(password)
                .setUrl(url);
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        return new FakeJmsBroker()
                .setName(jmsUser)
                .setPassword(jmsPassword)
                .setUrl(jmsUrl);
    }
}
