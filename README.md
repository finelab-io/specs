# specs

# OpenAPI

## Install
´´´
npm install -g @openapitools/openapi-generator-cli
´´´

## Generate

openapi-generator-cli generate \
-g spring \
-i https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/modules/openapi-generator/src/test/resources/3_0/petstore.yaml \
-o /var/tmp/ruby-client


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

