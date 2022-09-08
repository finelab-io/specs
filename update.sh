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
echo 'product-service-async-spec.yaml'
echo
echo '* markdown'

ag \
./domains/sales/product/product-service-async-spec.yaml \
@asyncapi/markdown-template \
-o ./markdown \
-p outFilename=product-service-async-spec.md \
--force-write 

echo '* provider-app'

ag \
./domains/sales/product/product-service-async-spec.yaml \
https://github.com/asyncapi/java-spring-cloud-stream-template.git \
-o modules/product-service-provider-app \
-p binder=kafka \
-p actuator=true \
-p artifactId=product-service-provider-app \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=3.2.4  \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech \
-p view=provider \
--force-write \

echo '* provider-lib'

ag \
./domains/sales/product/product-service-async-spec.yaml \
https://github.com/asyncapi/java-spring-cloud-stream-template.git \
-o modules/product-service-provider-lib \
-p binder=kafka \
-p actuator=true \
-p artifactId=product-service-provider-lib \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=3.2.4  \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech \
-p view=provider \
-p artifactType=library \
--force-write \

echo '* async-client-lib'

ag \
./domains/sales/product/product-service-async-spec.yaml \
https://github.com/asyncapi/java-spring-cloud-stream-template.git \
-o modules/product-service-async-client-lib \
-p binder=kafka \
-p actuator=true \
-p artifactId=product-service-async-client-lib \
-p groupId=dk.finetech \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=3.2.4  \
-p springCloudVersion=2021.0.3 \
-p javaPackage=dk.finetech \
-p view=client \
-p artifactType=library \
--force-write \
