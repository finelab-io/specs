# ------------
#
# run this script to update files in /markdown and /modules based on specification files 
# spec-files ending on '*-spec.yaml' is expected to be an openapi spec
# spec-files ending on '*-async-spec.yaml' is expected to be an asyncapi spec
# 
# Add a block generate the artifatcs for the spec-file
#
echo start generating ...
echo
echo 'product-service.yaml'
echo
echo '* markdown'

ag \
./domains/sales/product/product-service.yaml \
@asyncapi/markdown-template \
-o ./markdown \
-p outFilename=product-service.md \
--force-write 

echo '* product-service-app'

ag \
./domains/sales/product/product-service.yaml \
https://github.com/finelab-io/asyncapi-template-spring-cloud-stream.git \
-o modules/product-service-provider-app \
-p binder=kafka \
-p actuator=true \
-p artifactId=product-service-provider-app \
-p groupId=dk.finelab \
-p springBootVersion=2.7.3 \
-p springCloudStreamVersion=3.2.4  \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finelab.product.service.app \
-p view=provider \
--force-write \

echo '* product-service'

ag \
./domains/sales/product/product-service.yaml \
https://github.com/finelab-io/asyncapi-template-spring-cloud-stream.git \
-o modules/product-service-model \
-p binder=kafka \
-p actuator=true \
-p artifactId=product-service-model \
-p groupId=dk.finelab \
-p springBootVersion=2.7.3 \
-p springCloudStreamVersion=3.2.4  \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finelab.product.service.model \
-p view=provider \
-p artifactType=library \
--force-write \

echo '* product-service-client'

ag \
./domains/sales/product/product-service.yaml \
https://github.com/finelab-io/asyncapi-template-spring-cloud-stream.git \
-o modules/product-service-client-app \
-p binder=kafka \
-p actuator=true \
-p artifactId=product-service-client-app \
-p groupId=dk.finelab \
-p springBootVersion=2.7.3 \
-p springCloudStreamVersion=3.2.4  \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finelab.product.service.client.app \
-p view=client \
-p artifactType=library \
--force-write \
