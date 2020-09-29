package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
            List<Rating> ratings = Arrays.asList(
                    new Rating("1234", 4),
                    new Rating("2134", 3)
            );

            ratings.stream().map(rating ->  new CatalogItem("Transformers", "Test", 4))
                    .collect(Collectors.toList());

        // put them all together
    return Collections.singletonList(
            new CatalogItem("Transformers", "test", 4)
    );
    }
}
