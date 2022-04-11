package com.kelmorgan.mongostockservice.service;

import com.kelmorgan.mongostockservice.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream (Duration period);
}
