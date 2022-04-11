package com.kelmorgan.mongostockservice.service;

import com.kelmorgan.mongostockservice.domain.QuoteHistory;
import com.kelmorgan.mongostockservice.model.Quote;
import reactor.core.publisher.Mono;

public interface QuoteHistoryService {

    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);
}
