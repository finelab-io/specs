# specs


## asyncapi-sales-product

ag \
--force-write \
-o target/asyncapi-sales-product-client \
-p binder=kafka \
-p actuator=true \
-p artifactId=asyncapi-sales-product-client \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech.sales.product \
-p host=localhost:55555 \
-p username=default \
-p password=default \
-p msgVpn=default \
asyncapi-sales-product.yaml \
-p view=client \
https://github.com/asyncapi/java-spring-cloud-stream-template.git

ag \
--force-write \
-o target/asyncapi-sales-product-lib \
-p binder=kafka \
-p actuator=true \
-p artifactId=asyncapi-sales-product-lib \
-p artifactType=library \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech.sales.product \
-p host=localhost:55555 \
-p username=default \
-p password=default \
-p msgVpn=default \
-p view=client \
asyncapi-sales-product.yaml \
https://github.com/asyncapi/java-spring-cloud-stream-template.git

## asyncapi-sales-product

ag \
--force-write \
-o target/asyncapi-sales-order-client \
-p binder=kafka \
-p actuator=true \
-p artifactId=asyncapi-sales-order-client \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech.sales.order \
-p host=localhost:55555 \
-p username=default \
-p password=default \
-p msgVpn=default \
asyncapi-sales-order.yaml \
-p view=client \
https://github.com/asyncapi/java-spring-cloud-stream-template.git

ag \
--force-write \
-o target/asyncapi-sales-order-lib \
-p binder=kafka \
-p actuator=true \
-p artifactId=asyncapi-sales-order-lib \
-p artifactType=library \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech.sales.order \
-p host=localhost:55555 \
-p username=default \
-p password=default \
-p msgVpn=default \
-p view=client \
asyncapi-sales-order.yaml \
https://github.com/asyncapi/java-spring-cloud-stream-template.git