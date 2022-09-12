# specs

# OpenAPI

## Generate 

## markdown
https://davidgarcia.dev/posts/openapi-to-markdown/

### Install
´´´
  npm install -g widdershins
´´´

### Use
´´´
  widdershins \
  https://raw.githubusercontent.com/finelab-io/specs/main/domains/sales/product/product-api.yaml \
  -o markdown/2022-09-12-product-api.md \
  --language_tabs http:HTTP
´´´

## spring

### Install
´´´
npm install -g @openapitools/openapi-generator-cli
´´´

### Use
* https://github.com/OpenAPITools/openapi-generator#3---usage
* https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/java.md
* https://github.com/OpenAPITools/openapi-generator/tree/master/samples
* To get a list of general options available, please run
´´´
openapi-generator-cli help generate
´´´
* To get a list of language specific options available, please run


* To get a list of language specific options available, please run
´´´
openapi-generator-cli config-help -g spring
´´´

* To get the generator templates, please run and pick the right template
´´´
cd generator/spring/templates
openapi-generator-cli author template -g spring 
´´´

openapi-generator-cli generate \
-i https://raw.githubusercontent.com/finelab-io/specs/main/domains/sales/product/product-api.yaml \
-g spring \
-t generator/spring/templates \
-p apiPackage=dk.finelab.product.api \
-p modelPackage=dk.finelab.product.api.model \
-o modules/product-api-model \
-p groupId=dk.finelab \
-p artifactId=product-api-model \
-p bigDecimalAsString=true \
-p interfaceOnly=true \
-p useBeanValidation=true \
-p dateLibrary=java8 \
-p documentationProvider=none

# AsyncAPI

## Install


## Generate markdown and maven modules deployes as github packages

´´´sh
/generate-modules.sh
´´´
* generates markdown to ./markdown
* generates maven modules code to ./modules 

´´´sh
cd modules
mvn package deploy
´´´
* geneatesdeploy to https://github.com/orgs/finelab-io/packages 

