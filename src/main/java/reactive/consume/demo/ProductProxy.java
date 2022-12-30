package reactive.consume.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class ProductProxy {

    private final WebClient webClient;

    public Flux<Product> getAll() {
        return webClient.get()
                .uri("/products")
                .exchangeToFlux(res -> res
                        .bodyToFlux(Product.class));
    }
}
