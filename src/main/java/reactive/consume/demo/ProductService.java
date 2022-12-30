package reactive.consume.demo;

import lombok.RequiredArgsConstructor;
import org.reactivestreams.Subscriber;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductProxy productProxy;

    public Flux<Product> getAll() {
        return productProxy.getAll();
    }
}
