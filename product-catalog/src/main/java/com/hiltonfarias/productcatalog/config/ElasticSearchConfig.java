package com.hiltonfarias.productcatalog.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.hiltonfarias.productcatalog.repository")
public class ElasticSearchConfig  extends AbstractElasticsearchConfiguration {

    @Override
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration
                .builder()
                .connectedTo("localhost:9200", "localhost:9300")
                .build();

        return RestClients.create(clientConfiguration).rest();
    }

//    @Bean
//    @Override
//    public EntityMapper entityMapper() {
//        ElasticSearchEntityMapper elasticSearchEntityMapper = new
//                ElasticSearchEntityMapper(elasticSearchMappingContext(), new DefaultConversionService());
//        elasticSearchEntityMapper.setConversions(elasticSearchCustomConversions());
//
//        return elasticSearchEntityMapper;
//    }
}
