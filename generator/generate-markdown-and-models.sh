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
echo '***** product-service.yaml *****'
echo
echo '* markdown'

ag \
../domains/sales/product/product-service.yaml \
@asyncapi/markdown-template \
-o ../markdown \
-p outFilename=product-service.md \
--force-write 

echo '* product-service-app'

ag \
../domains/sales/product/product-service.yaml \
https://github.com/finelab-io/asyncapi-template-spring-cloud-stream.git \
-o ../models/product-service-provider-app \
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
../domains/sales/product/product-service.yaml \
https://github.com/finelab-io/asyncapi-template-spring-cloud-stream.git \
-o ../models/product-service-model \
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
../domains/sales/product/product-service.yaml \
https://github.com/finelab-io/asyncapi-template-spring-cloud-stream.git \
-o ../models/product-service-client-app \
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

echo
echo '***** product-api.yaml *****'
echo
echo '* markdown'

  widdershins \
  ../domains/sales/product/product-api.yaml \
  -o ../markdown/2022-09-12-product-api.md \
  --language_tabs http:HTTP

echo '* product-api-model'

openapi-generator-cli generate \
-i ../domains/sales/product/product-api.yaml \
-g spring \
-t ../generator/spring/templates \
-p apiPackage=dk.finelab.product.api \
-p modelPackage=dk.finelab.product.api.model \
-o ../models/product-api-model \
-p groupId=dk.finelab \
-p artifactId=product-api-model \
-p bigDecimalAsString=true \
-p interfaceOnly=true \
-p useBeanValidation=true \
-p dateLibrary=java8 \
-p documentationProvider=none