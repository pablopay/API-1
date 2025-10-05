# 🧩 IMAGEN BASE
FROM eclipse-temurin:21.0.8_9-jdk

# 📂 DIRECTORIO DE TRABAJO DENTRO DEL CONTENEDOR
WORKDIR /root

# 🧾 COPIAR ARCHIVOS NECESARIOS PARA DESCARGAR DEPENDENCIAS
COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

# ⚙️ DESCARGAR DEPENDENCIAS DE MAVEN (sin ejecutar tests)
RUN ./mvnw dependency:go-offline

# 💻 COPIAR EL CÓDIGO FUENTE AL CONTENEDOR
COPY ./src /root/src

# 🏗️ CONSTRUIR LA APLICACIÓN (compila y empaqueta en .jar)
RUN ./mvnw clean install -DskipTests

# 🚀 EJECUTAR LA APLICACIÓN AL INICIAR EL CONTENEDOR
ENTRYPOINT ["java", "-jar", "/root/target/product-service-0.0.1-SNAPSHOT.jar"]
