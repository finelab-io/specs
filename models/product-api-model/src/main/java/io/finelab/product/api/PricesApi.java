/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.finelab.product.api;

import io.finelab.product.api.model.Price;
import io.finelab.product.api.model.PricePage;
import io.finelab.product.api.model.Problem;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T22:44:55.180417+02:00[Europe/Copenhagen]")
@Validated
@RequestMapping("${openapi.product.base-path:}")
public interface PricesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /prices/{id}
     * Get price by id
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/prices/{id}",
        produces = { "application/json", "application/problem+json" }
    )
    default ResponseEntity<Price> getPriceById(
         @PathVariable("id") String id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"match_criteria\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"amount\" : 100.0, \"product_url\" : \"product_url\", \"valid_to\" : \"valid_to\", \"valid_from\" : \"valid_from\", \"id\" : \"id\", \"expired_at\" : \"expired_at\", \"display_name\" : \"display_name\", \"published_at\" : \"published_at\", \"charged\" : \"per_month\", \"url\" : \"https://api.finelab.io/prices/127635233\", \"revision\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /prices
     * Get prices
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/prices",
        produces = { "application/json", "application/problem+json" }
    )
    default ResponseEntity<PricePage> getPrices(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"match_criteria\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"amount\" : 100.0, \"product_id\" : \"product_id\", \"valid_to\" : \"valid_to\", \"valid_from\" : \"valid_from\", \"id\" : \"id\", \"expired_at\" : \"expired_at\", \"display_name\" : \"display_name\", \"published_at\" : \"published_at\", \"charged\" : \"per_month\", \"url\" : \"url\", \"revision\" : 0 }, { \"match_criteria\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"amount\" : 100.0, \"product_id\" : \"product_id\", \"valid_to\" : \"valid_to\", \"valid_from\" : \"valid_from\", \"id\" : \"id\", \"expired_at\" : \"expired_at\", \"display_name\" : \"display_name\", \"published_at\" : \"published_at\", \"charged\" : \"per_month\", \"url\" : \"url\", \"revision\" : 0 } ], \"url\" : \"https://api.finelab.io/prices\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
