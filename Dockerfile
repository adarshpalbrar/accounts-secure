FROM amazoncorretto:17-alpine as build
RUN mkdir -p /app/src
COPY . /app/src
WORKDIR /app/src
RUN ./mvnw clean package

# Added comment in the dockerfile, added commnet on the feature branch as well.
FROM amazoncorretto:17-alpine
COPY --from=build /app/src/target/*.jar /app/app.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/app/app.jar"]
