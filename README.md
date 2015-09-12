# AngularJSSpringBootApp

Running Bower requires you to install it though the Node.js package manager:

npm install -g bower

And then you will be able to install your dependencies by entering the following commands:

cd ./src/main/resources/static

bower install

cd ../../../..


BUILD: mvn clean package


RUN:  java -jar target/angularjsspringboot-0.0.1-SNAPSHOT.jar

Then open the URL: http://localhost:8080
