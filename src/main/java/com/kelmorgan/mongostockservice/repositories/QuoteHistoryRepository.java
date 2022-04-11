package com.kelmorgan.mongostockservice.repositories;

import com.kelmorgan.mongostockservice.domain.QuoteHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteHistoryRepository extends ReactiveMongoRepository<QuoteHistory,String> {
}
