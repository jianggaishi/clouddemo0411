FROM jdk1.8:latest
MAINTAINER jiangmeng
RUN mkdir /usr/local/jiangmeng
COPY order-service/target/order-service-1.0.jar /usr/local/jiangmeng/app.jar
WORKDIR /usr/local/jiangmeng
RUN chmod +x /usr/local/jiangmeng/app.jar
CMD java -jar /usr/local/jiangmeng/app.jar