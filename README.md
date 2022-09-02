# specs


## asyncapi-sales-product

ag \
--force-write \
-o target/sales-product-async-client \
-p binder=kafka \
-p actuator=true \
-p artifactId=sales-product-async-client \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech.sales.product \
-p host=localhost:55555 \
-p username=default \
-p password=default \
-p msgVpn=default \
sales/product-service-asyncapi.yaml \
-p view=client \
https://github.com/asyncapi/java-spring-cloud-stream-template.git

ag \
--force-write \
-o target/sales-product-async-lib \
-p binder=kafka \
-p actuator=true \
-p artifactId=sales-product-async-client \
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
sales/product-service-asyncapi.yaml \
-p view=client \
https://github.com/asyncapi/java-spring-cloud-stream-template.git

## asyncapi-sales-catalog

ag \
--force-write \
-o target/sales-order-async-client \
-p binder=kafka \
-p actuator=true \
-p artifactId=sales-order-async-client \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech.sales.order \
-p host=localhost:55555 \
-p username=default \
-p password=default \
-p msgVpn=default \
sales/order-service-asyncapi.yaml \
-p view=client \
https://github.com/asyncapi/java-spring-cloud-stream-template.git

ag \
--force-write \
-o target/sales-order-async-lib \
-p binder=kafka \
-p actuator=true \
-p artifactId=sales-order-async-client \
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
sales/order-service-asyncapi.yaml \
-p view=client \
https://github.com/asyncapi/java-spring-cloud-stream-template.git
